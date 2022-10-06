package com.oop.staticExamples;

public class StaticBlock {
    static int a = 20;
    static int b;

    static {
        b =a+ 40;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlock.b);
    }
}
