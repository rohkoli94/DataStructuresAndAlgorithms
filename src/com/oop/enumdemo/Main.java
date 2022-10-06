package com.oop.enumdemo;

enum WEEK {
    MONDAY, TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY, SUNDAY
        }

public class Main {
    enum COLOR {
        RED, BLUE;

        COLOR(){
            System.out.println("enum COLOR constructor");
        }

        void test(){
            System.out.println("inside test");
        }
    }

    public static void main(String[] args) {
        COLOR c;
        c = COLOR.BLUE;
        System.out.println(c);

        for(COLOR cc : COLOR.values()){
            System.out.println(cc);
        }
    }
}
