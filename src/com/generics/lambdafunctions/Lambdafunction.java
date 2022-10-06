package com.generics.lambdafunctions;

public class Lambdafunction {

    public int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }

    public static void main(String[] args) {
        Operation add = (a,b)-> a+b;
        Operation mul = (int a,int b)-> a*b;

       // add.operation(4,5);
        // mul.operation(4,5);
        Lambdafunction calculator = new Lambdafunction();

        System.out.println(calculator.operate(2,5,add));
        System.out.println(calculator.operate(2,5,mul));
    }
}

interface Operation {
    int operation(int a, int b);
}