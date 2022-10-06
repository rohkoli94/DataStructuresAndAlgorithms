package com.oop.access;

public class Main extends A{

    public Main(int num, String name){
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(10,"rohit");
        int n = obj.num;
        obj.test();

        Main obj4 = new Main(10,"rohit");
        int n1 = obj4.num;
    }

}


