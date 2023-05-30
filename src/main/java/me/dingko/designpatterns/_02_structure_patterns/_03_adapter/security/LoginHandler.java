package me.dingko.designpatterns._02_structure_patterns._03_adapter.security;

public class LoginHandler {
    /**
     * LoginHandler 가 Client 라고 생각한다면,
     *  - UserDetailsService 와 UserDetails 인터페이스가 Client 가 사용하는 Target Interface 에 해당한다.
     */
    UserDetailsService userDetailsService;

    public LoginHandler(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public String login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUser(username);
        if (userDetails.getPassword().equals(password)) {
            return userDetails.getUsername();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
