package com.java.MainFlow;

import com.java.Account.Account;
import com.java.User.UserClass;

public class MainBody {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("MOUNICAPAVAN");
        account.setBalance(500);
        account.setAddress("Vizag");

        UserClass user = new UserClass("MAHADASA",25,"9515275520",account);
        user.Userdate();
    }
}
