package org.example;

import java.io.Serializable;

public class LoginData {
    private String email;
    private String password;

    public LoginData(String email, String password) {
        super();
        this.email = email;
        this.password = password;
    }

    public LoginData() {
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "LoginData{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
