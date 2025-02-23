package com.add;
import java.util.Scanner;
class Add {
    //int a, b, c;
//    Add(int a, int b, int c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//}
public void add() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter first number : ");
    int a=scan.nextInt();
    System.out.println("Entered First value is : "+a);
    System.out.print("Enter second number : ");
    int b=scan.nextInt();
    System.out.println("Entered Second value is : "+b);
    int c = a + b;
    System.out.println("Addition of a & b is :"+ c);
}
}
public class Addition {
    public static void main(String[] args) {
        Add add = new Add();
        add.add();

    }
}
