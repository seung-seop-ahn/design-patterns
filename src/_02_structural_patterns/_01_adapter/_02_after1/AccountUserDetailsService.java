package _02_structural_patterns._01_adapter._02_after1;

import _02_structural_patterns._01_adapter._02_after1.security.UserDetails;
import _02_structural_patterns._01_adapter._02_after1.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    private AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = this.accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
