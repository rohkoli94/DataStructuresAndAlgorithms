package com.revision3.strings;

import java.util.ArrayList;
import java.util.List;

public class Phone {

    public static void main(String[] args) {
        String up = "";
        phonepad("",up);
        System.out.println();
        System.out.println(phonePadActual("",up));
    }

    private static List<String> phonePadActual(String p, String up) {
        // base condition
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            if(!p.isEmpty()){
                list.add(p);
            }
            return list;
        }
        List<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        int s = -1;
        int e = -1;

        if(digit > 1 && digit <= 7){
            s = (digit - 2) * 3;
            if(digit == 7){
                e = 18;
            }else{
                e =  ((digit - 1) * 3 ) -1;
            }
        }else if(digit == 8){
            s = 19;
            e = 21;
        }else if(digit == 9){
            s = 22;
            e = 26;
        }

        if(s != -1){
            for (int i = s; i <= e ; i++) {
                char ch = (char) ('a' + i);
                list.addAll(phonePadActual(p+ch, up.substring(1)));
            }
        }else{
            list.addAll(phonePadActual(p, up.substring(1)));
        }

        return list;
    }

    private static void phonepad(String p, String up) {
        // base condition
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        // check number and form start and end position
        int digit = up.charAt(0) - '0';  // gives integer value

        int s = (digit-1)*3;
        int e = (digit*3)-1;
        for(int i = s ; i <= e; i++ ){
            char ch = (char) ('a' + i);
            phonepad(p+ch,up.substring(1));
        }
    }
}
