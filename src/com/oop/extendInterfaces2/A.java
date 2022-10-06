package com.oop.extendInterfaces2;

public interface A {

    static void test(){
        System.out.println("hello static A");
    };
    default void check(){
        System.out.println("A interface check");
    }
}
