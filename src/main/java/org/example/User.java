package org.example;

import java.util.Date;

public class User {
    private int userId;
    private String email;
    private int roleId;
    private Date changedAt;
    private boolean isBlocked;
    private Roles roles;

    public User(int userId, String email, int roleId, Date changedAt, boolean isBlocked, Roles roles) {
        this.userId = userId;
        this.email = email;
        this.roleId = roleId;
        this.changedAt = changedAt;
        this.isBlocked = isBlocked;
        this.roles = roles;
    }

    public User() {

    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public Date getChangedAt() {
        return changedAt;
    }

    public void setChangedAt(Date changedAt) {
        this.changedAt = changedAt;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", roleId=" + roleId +
                ", changedAt=" + changedAt +
                ", isBlocked=" + isBlocked +
                ", roles=" + roles +
                '}';
    }
}

