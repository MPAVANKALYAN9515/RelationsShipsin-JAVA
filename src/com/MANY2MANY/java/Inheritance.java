package com.MANY2MANY.java;
class A {
    int k=m0();
    static int i = N0();
    int j = 20;
    A(){
        System.out.println("Inside Constructor A");
    }

    static {
        System.out.println("Inside static block from class - A");
    }
    {
        System.out.println("Inside instance block from class - A");
    }
    int m0() {
        System.out.println("Inside instance method from class - A");
        return 10;
    }
    static int N0() {
        System.out.println("Inside static method from class - A");
        return 20;
    }

}
class B extends A {
    int k =m1();
    static int i = 30;
    int j = 40;

    static {
        System.out.println("Inside static block from class - B");
    }
    {
        System.out.println("Inside instance block from class - B");
    }
    int m1() {
        System.out.println("Inside instance m1 from class - B");
        return 20;
    }
    B(){
        System.out.println("Inside Constructor B");
    }
}
class C extends B {
    int k =m2();
    static int i = 50;
    int j = 60;
    static {
        System.out.println("Inside static block from class - C");
    }
    {
        System.out.println("Inside instance block from class - C");
    }
    int  m2() {
        System.out.println("Inside instance  m2 from class - C");
        return 30;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        C c = new C();
        System.out.println("================================================");
        C c2 = new C();
    }
}
