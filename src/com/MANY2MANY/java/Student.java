package com.MANY2MANY.java;

public class Student {
    private String Sname;
    private String Sid;
    private String Saddress;
    private Books[] Book;

    public void setSname(String Sname) {
        this.Sname = Sname;
    }
    public  String getSname() {
        return Sname;
    }
    public void setSid(String Sid) {
        this.Sid = Sid;
    }
    public String getSid() {
        return Sid;
    }
    public void setSaddress(String Saddress) {
        this.Saddress = Saddress;
    }
    public String getSaddress() {
        return Saddress;
    }
    public void setBook(Books[] Book) {
        this.Book = Book;
    }
    public Books[] getBook() {
        return Book;
    }

    public void displaydata() {
        System.out.println("    STUDENT DETAILS     ");
        System.out.println("------------------------");
        System.out.println("Sname       : " + Sname);
        System.out.println("Sid         : " + Sid);
        System.out.println("Saddress    : " + Saddress);
        System.out.println("    BOOKS DETAILS       ");
        System.out.println("------------------------");
        if (Book != null) {
            for (Books str : Book) {
                System.out.println("SUBJECT  01 :   " + str.getSub01());
                System.out.println("SUBJECT  02 :   " + str.getSub02());
                System.out.println("SUBJECT  03 :   " + str.getSub03());
                System.out.println("SUBJECT  04 :   " + str.getSub04());
                System.out.println("SUBJECT  05 :   " + str.getSub05());
                System.out.println("SUBJECT  06 :   " + str.getSub06());
            }
        } else {
            System.out.println("No books assigned.");
        }
    }

}



