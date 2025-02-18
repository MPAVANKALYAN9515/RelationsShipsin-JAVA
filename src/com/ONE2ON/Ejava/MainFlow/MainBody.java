package com.ONE2ON.Ejava.MainFlow;

import com.ONE2ON.Ejava.Account.Account;
import com.ONE2ON.Ejava.User.UserClass;

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
