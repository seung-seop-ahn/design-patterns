package _03_behavioral_patterns._01_chain_of_responsibilities._01_before;

public class AuthRequestHandler extends RequestHandler {

    public void handler(Request request) {
        System.out.println("Is the request certified?");
        System.out.println("Is user available using this handler?");
        super.handler(request);
    }
}
