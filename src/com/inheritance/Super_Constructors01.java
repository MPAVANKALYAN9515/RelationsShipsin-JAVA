package com.inheritance;
//MAHADASA CHANDU SIVA SANKARA PAVA KALYAN.
class A11 {
    public A11() {
        System.out.println("Chef cooked PASTA");
    }
}
class A22 extends A11 {
    public A22() {
        System.out.println("Student Added Cheese");
    }
}
class A33 extends A22 {
    public A33() {
        System.out.println("Customer eats PASTA");
    }
}
public class Super_Constructors01 {
    public static void main(String[] args) {
        A33 obj = new A33();
    }
}


