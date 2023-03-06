package org.example;

import java.util.Date;

public class Roles {
    private int roleId;
    private String roleName;
    private Date changedAt;

    public Roles() {
    }

    public Roles(int roleId, String roleName, Date changedAt) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.changedAt = changedAt;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getChangedAt() {
        return changedAt;
    }

    public void setChangedAt(Date changedAt) {
        this.changedAt = changedAt;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", changedAt=" + changedAt +
                '}';
    }
}
