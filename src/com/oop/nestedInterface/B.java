package com.oop.nestedInterface;

public class B implements  A.NestedInf{

    @Override
    public boolean isOdd(int n){
        return (n &1) == 1;
    };
}
