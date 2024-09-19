package _02_structural_patterns._01_adapter._03_after2.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
