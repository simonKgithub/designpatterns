package me.dingko.designpatterns._02_structure_patterns._03_adapter;

import me.dingko.designpatterns._02_structure_patterns._03_adapter.security.UserDetails;
import me.dingko.designpatterns._02_structure_patterns._03_adapter.security.UserDetailsService;

public class AccountService implements UserDetailsService {
    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

    @Override
    public UserDetails loadUser(String username) {
        return findAccountByUsername(username);
    }
}
