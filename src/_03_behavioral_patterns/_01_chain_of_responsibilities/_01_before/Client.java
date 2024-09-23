package _03_behavioral_patterns._01_chain_of_responsibilities._01_before;

public class Client {

    public static void main(String[] args) {
        Request request = new Request("hello world");
//        RequestHandler requestHandler = new AuthRequestHandler();
        RequestHandler requestHandler = new LoggingRequestHandler();
        requestHandler.handler(request);
    }
}
