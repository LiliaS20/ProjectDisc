package ru.stqa.pft.addressbook.model;

public class Login11 {
    private final String userLogin;
    private final String userPassword;

    public Login11 (String userLogin, String userPassword) {
        this.userLogin = userLogin;
        this.userPassword = userPassword;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }
}
