package _02_structural_patterns._01_adapter._02_after1;

import _02_structural_patterns._01_adapter._02_after1.security.LoginHandler;
import _02_structural_patterns._01_adapter._02_after1.security.UserDetailsService;

public class Client {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("user", "user");
        System.out.println(login);
    }
}
