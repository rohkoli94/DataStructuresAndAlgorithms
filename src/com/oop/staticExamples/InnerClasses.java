package com.oop.staticExamples;

public class InnerClasses {

    static String str = "rohit";
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }

    }

    public static void main(String[] args) {

       Test a = new Test("koli");
       Test b = new Test("brady");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}
