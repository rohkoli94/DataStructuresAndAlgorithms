package com.oop;

public class Oops1 {

    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        a = b;

        final Integer INCREASE = 2;

        System.out.println(a);
        Student s0 = new Student();
        System.out.println(s0.name);

        Student s1 = new Student("koli",1,10f);
        s1.greetings();

        Student s2 = new Student("patil");
        s2.greetings();

        Student one = new Student();
        Student two = one;

        one.name = "brady";
        System.out.println(two.name);

    }

    static class Student {

        final Integer INCREASE = 10;
        String name;
        int rollNo;
        double marks;

        void greetings(){
            System.out.println("hello "+name);
        }

        Student(String name1){
            this.name = name1;
        }

        Student(Student other){
            this.name = other.name;
        }

        Student(String name, int rollNo, double marks){
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }

        Student(){
            this ("rohit",2,99.0f);
        }

    }

}
