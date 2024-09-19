package _02_structural_patterns._01_adapter._02_after1.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
