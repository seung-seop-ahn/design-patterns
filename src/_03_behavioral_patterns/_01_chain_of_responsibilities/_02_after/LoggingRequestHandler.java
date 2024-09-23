package _03_behavioral_patterns._01_chain_of_responsibilities._02_after;

public class LoggingRequestHandler extends RequestHandler {

    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handler(Request request) {
        System.out.println("Logging");
        super.handler(request);
    }
}
