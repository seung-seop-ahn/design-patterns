package _03_behavioral_patterns._01_chain_of_responsibilities._02_after;

public abstract class RequestHandler {

    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handler(Request request) {
        if(nextHandler != null) {
            nextHandler.handler(request);
        }
        System.out.println(request.getBody());
    }
}
