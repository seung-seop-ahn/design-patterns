package _03_behavioral_patterns._01_chain_of_responsibilities._02_after;

public class PrintRequestHandler extends RequestHandler {

    public PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handler(Request request) {
        System.out.println(request.getBody());
        super.handler(request);
    }
}
