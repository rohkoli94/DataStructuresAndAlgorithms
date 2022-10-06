package com.oop.polymorphism;

public class Number {

    int numeric;
    String alphanumeric;
    int binary;

    public Number(int numeric, String alphanumeric, int binary) {
        this.numeric = numeric;
        this.alphanumeric = alphanumeric;
        this.binary = binary;
    }

    public Number(int numeric, String alphanumeric) {
        this.numeric = numeric;
        this.alphanumeric = alphanumeric;
    }

    public Number(){
        System.out.println("cons called");
    }

    public static void main(String[] args) {
        System.out.println("hello");
        Number num = new Number();
        num.sum(20.0,20);
    }

    // no of arguments can be different
     int add(int a, int b){
        return a + b;
     }
    int add(int a,int b, int c){
        return a + b + c;
    }

    // data type can be different
    void sum (int a, double b){
        System.out.println("summ first");
    }

    void sum(double a, int b){
        System.out.println("summ second");
    }


}
