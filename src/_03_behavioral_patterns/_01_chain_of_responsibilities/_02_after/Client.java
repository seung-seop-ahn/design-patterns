package _03_behavioral_patterns._01_chain_of_responsibilities._02_after;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("hello world");
        requestHandler.handler(request);
    }

    public static void main(String[] args) {
        RequestHandler requestHandler = new AuthRequestHandler(
                new LoggingRequestHandler(
                        new PrintRequestHandler(null)
                )
        );

        Client client = new Client(requestHandler);
        client.doWork();
    }
}
