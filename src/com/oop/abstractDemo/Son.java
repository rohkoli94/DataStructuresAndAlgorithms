package com.oop.abstractDemo;

public class Son extends Parent{

    Son(){
        super();
    }
    @Override
    public void career(){
        System.out.println("sons career is coder");
    }

    @Override
    public void skills(int n){
        System.out.println("sons skills");
    }

    void test1(){
        System.out.println("inside son");
    }

    public static void main(String[] args) {
        Parent p = new Son();
        p.career();
        p.skills(2);
        p.n = 100;

        Parent p2 = new Son();
        p.career();
        p.skills(2);
        p2.n = 200;

        System.out.println(p.n);
        System.out.println(p2.n);

    }
}
