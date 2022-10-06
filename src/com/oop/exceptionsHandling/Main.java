package com.oop.exceptionsHandling;

public class Main {
    public static void main(String[] args) throws MyException{

        try{
            // throw new MyException("my exception");
             int a = divide(1,0);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("finally block");
        }
    }

    public static int divide(int a, int b) throws MyException{
        if(b == 0){
            throw new MyException("do not divide by 0");
        }
        return a/b;
    }
}
