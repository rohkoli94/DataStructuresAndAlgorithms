package com.generics.comparision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1,90.20f);
        Student s2 = new Student(7,54.56f);
        Student s3 = new Student(4,99.74f);
        Student s4 = new Student(9,97.32f);

        Student[] list = {s1,s2,s3,s4};

      //  Arrays.sort(list);
       // System.out.println(Arrays.toString(list));

//        Arrays.sort(list,new Comparator<Student>(){
//            @Override
//            public int compare (Student o1, Student o2){
//                int diff = (int)(o1.marks - o2.marks);
//                return diff;
//            }
//        });

        Arrays.sort(list, (o1,o2) -> (int)(o1.marks - o2.marks) );
         System.out.println(Arrays.toString(list));


//      if(s1.compareTo(s2) > 0){
//          System.out.println("s1 is greater");
//      }else if(s1.compareTo(s2) < 0){
//          System.out.println("s2 is greater");
//      }else{
//          System.out.println("both are equal");
//      }
//        System.out.println(s1.compareTo(s2));
//
//        System.out.println();
    }
}
