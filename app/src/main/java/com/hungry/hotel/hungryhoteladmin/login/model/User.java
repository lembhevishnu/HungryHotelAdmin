package com.hungry.hotel.hungryhoteladmin.login.model;

public class User {
    public static String DELIVERY_BOY = "Delivery Boy";
    public static String HOTEL_ADMIN = "Hotel";
    private int id;
    private String name;
    private String password;
    private String accountType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
