package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("HELLO!!");
        Display("Nahid Hasan");
        int a=add(7,5);
        System.out.println("The sum is = "+a);
    }
    public static void Display(String name){
        System.out.println("Bye Bye "+name);
    }
    public static int add(int a,int b){
        return a+b;
    }
}
