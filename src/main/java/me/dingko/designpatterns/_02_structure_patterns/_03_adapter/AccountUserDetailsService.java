package me.dingko.designpatterns._02_structure_patterns._03_adapter;

import me.dingko.designpatterns._02_structure_patterns._03_adapter.security.UserDetails;
import me.dingko.designpatterns._02_structure_patterns._03_adapter.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {
    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account accountByUsername = accountService.findAccountByUsername(username);
        // Account를 UserDetails로 변경해준다. AccountUserDetails 클래스 이용
        return new AccountUserDetails(accountByUsername);

    }
}
