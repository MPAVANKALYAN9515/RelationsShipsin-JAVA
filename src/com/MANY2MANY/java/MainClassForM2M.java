package com.MANY2MANY.java;

public class MainClassForM2M {
    public static void main(String[] args) {
        Books books01= new Books("English","Telugu","Hindi","Mathematics","Science","Social Science");
        Books books02= new Books("sgege","rsgsrg","Hindi","wwfw","Science","Social Science");

        Books[] b ={books01};
        Books[] b1 ={books02};

        Student std01 = new Student();
        std01.setSname("MOUNICA");
        std01.setSid("123");
        std01.setSaddress("HYDERABAD");
        std01.setBook(b);

        std01.displaydata();

        Student std02 = new Student();
        std02.setSname("PAVAN");
        std02.setSid("456");
        std02.setSaddress("HYDERABAD");
        std02.setBook(b1);

        std02.displaydata();

        Student std03 = new Student();
        std03.setSname("KALYAN");
        std03.setSid("789");
        std03.setSaddress("HYDERABAD");
        std03.setBook(b);

        std03.displaydata();

        Student std04 = new Student();
        std04.setSname("PRIYA");
        std04.setSid("222");
        std04.setSaddress("HYDERABAD");
        std04.setBook(b1);

        std04.displaydata();
    }
}
