package com.java.User;

import com.java.Account.Account;

public class UserClass {
    private String name;
    private int age;
    private String mobile;
    private Account account;
    public UserClass(String name, int age, String mobile, Account account) {
        this.name = name;
        this.age = age;
        this.mobile = mobile;
        this.account = account;
    }
    public void Userdate() {
        System.out.println("USER DATA FOR CONFIRMATION");
        System.out.println("----------------------------------------------");
        System.out.println("User name       :   "+name);
        System.out.println("User age        :   " + age );
        System.out.println("User Mobile     :   "+ mobile);
        System.out.println("        User Account       ");
        System.out.println("----------------------------------------------");
        System.out.println("Account name    :   "+account.getName());
        System.out.println("Account Address :   "+account.getAddress());
        System.out.println("Accont balance  :   "+account.getBalance());
    }


}
