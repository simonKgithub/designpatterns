package me.dingko.designpatterns._02_structure_patterns._03_adapter;

import me.dingko.designpatterns._02_structure_patterns._03_adapter.security.UserDetails;

public class AccountUserDetails implements UserDetails {
    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
