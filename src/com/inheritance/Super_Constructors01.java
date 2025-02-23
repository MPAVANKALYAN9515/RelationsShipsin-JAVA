package com.inheritance;
//MAHADASA CHANDU SIVA SANKARA PAVA KALYAN.
class A1 {
    public A1() {
        System.out.println("Chef cooked PASTA");
    }
}
class A2 extends A1 {
    public A2() {
        System.out.println("Student Added Cheese");
    }
}
class A3 extends A2 {
    public A3() {
        System.out.println("Customer eats PASTA");
    }
}
public class Super_Constructors01 {
    public static void main(String[] args) {
        A3 obj = new A3();
    }
}


