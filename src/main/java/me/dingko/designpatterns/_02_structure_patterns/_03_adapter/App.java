package me.dingko.designpatterns._02_structure_patterns._03_adapter;

import me.dingko.designpatterns._02_structure_patterns._03_adapter.security.LoginHandler;
import me.dingko.designpatterns._02_structure_patterns._03_adapter.security.UserDetailsService;

import java.io.*;

/**
 * 어댑터 패턴: 기존 코드를 클라이언트가 사용하는 인터페이스의 구현체로 바꿔주는 패턴
 *  - 클라이언트가 사용하는 인터페이스를 따르지 않는 기존 코드를 재사용할 수 있게 해준다.
 */
public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("dingko_", "dingko_");
        System.out.println(login);

        try(InputStream is = new FileInputStream("input.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
        ){
        } catch( IOException e ){
            new RuntimeException(e);
        }
    }


}
