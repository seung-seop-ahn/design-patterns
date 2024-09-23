package _03_behavioral_patterns._01_chain_of_responsibilities._01_before;

public class LoggingRequestHandler extends RequestHandler {

    @Override
    public void handler(Request request) {
        System.out.println("Logging");
        super.handler(request);
    }
}
