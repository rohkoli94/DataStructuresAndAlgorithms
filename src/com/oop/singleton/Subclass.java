package com.oop.singleton;

import com.oop.access.A;

public class Subclass extends A {

    public Subclass (int num, String name){
        super(num,name);
    }

    public static void main(String[] args) {
        Subclass s = new Subclass(2,"ro");
        int n = s.num;

    }
}

class Subclass2 extends Subclass {
    public Subclass2 (int num, String name){
        super(num,name);
    }

    public static void main(String[] args) {
        Subclass2 s = new Subclass2(2,"ro");
        int n = s.num;
    }
}

class Subclass3 extends Subclass2 {
    public Subclass3 (int num, String name){
        super(num,name);
    }

    public static void main(String[] args) {
        Subclass3 s = new Subclass3(2,"ro");
        int n = s.num;
    }
}