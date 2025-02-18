package com.java.Account;

public class Account {
    private String name;
    private String address;
    private int balance;
    // Constructor injection.

  /*  public Account(String name, String address, int balance) {
        this.name = name;
        this.address = address;
        this.balance = balance;
    }*/

    //Setter & getter injection
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address) {
            this.address = address;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getName(){
     return name;
    }
    public String getAddress(){
        return address;
    }
    public int getBalance(){
        return balance;
    }

}
