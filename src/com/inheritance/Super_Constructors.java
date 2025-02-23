package com.inheritance;
class A1 {
    public A1() {
        System.out.println("Inside constructor A1");
    }
}
class A2 extends A1 {
    public A2(int i) {
        System.out.println("Inside constructor A2");
    }
}
class A3 extends A2 {
    public A3() {
       /*
       parent constructor:

        public A2(int i){
        ===========================
        =========================
        }
       if super(10); --> is not there then below error should be shown.
        There is no parameterless constructor available in 'com. inheritance. A2' */
        super(5);
        System.out.println("Inside constructor A3");
    }
}
public class Super_Constructors {
    public static void main(String[] args) {
        A3 obj = new A3();
    }
}

/*
Note:
1. In inheritance, parent constructor must always Zero
 param constructor, If we use param in parent then we
 should explicitly declare that constructor with super
  keyword with param's.

2. Always use super constructor in child constructor only .....
not in methods(throws error).

  */
