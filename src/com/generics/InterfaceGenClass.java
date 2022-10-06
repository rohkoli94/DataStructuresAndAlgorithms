package com.generics;

public class InterfaceGenClass implements  InterfaceGenerics<Integer> {

    @Override
    public void test(Integer a){
        System.out.println("test");
    };
}
