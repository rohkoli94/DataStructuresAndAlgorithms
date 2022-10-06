package com.oop.cloning;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException{
        CloneDemo c1 = new CloneDemo(1,"rohit");
        CloneDemo c2 = (CloneDemo)c1.clone();

        c2.arr[0] = 100;
        c2.name = "brad";
        c2.rollno = 2;

        System.out.println(c1.rollno);
        System.out.println(c2.rollno);
        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println(Arrays.toString(c1.arr));
        System.out.println(Arrays.toString(c2.arr));

    }
}
