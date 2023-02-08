package me.dingko.designpatterns._02_structure_patterns._03_adapter;

import me.dingko.designpatterns._02_structure_patterns._03_adapter.security.LoginHandler;
import me.dingko.designpatterns._02_structure_patterns._03_adapter.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("dingko_", "dingko_");
        System.out.println(login);
    }
}
