package _02_structural_patterns._01_adapter._01_before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
