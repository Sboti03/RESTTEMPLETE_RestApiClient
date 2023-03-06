package org.example;

public class LoginResponse {
    private User user;
    private Tokens tokens;

    public LoginResponse(User user, Tokens tokens) {
        this.user = user;
        this.tokens = tokens;
    }

    public LoginResponse() {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tokens getTokens() {
        return tokens;
    }

    public void setTokens(Tokens tokens) {
        this.tokens = tokens;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "user=" + user +
                ", tokens=" + tokens +
                '}';
    }
}
