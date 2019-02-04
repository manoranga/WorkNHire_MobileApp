package com.example.heyshan.worknhire.Chat;

/**
 * Created by DELL on 12/1/2017.
 * All Rights Reserved by MLPJ©
 */

public class EmployerItem {
    private String name;
    private String userId;

    public EmployerItem() {
    }

    public EmployerItem(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
