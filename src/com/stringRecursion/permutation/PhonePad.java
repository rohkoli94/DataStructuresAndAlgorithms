package com.stringRecursion.permutation;

public class PhonePad {
    public static void main(String[] args) {
        String str = "12";
        //pad("",str);

        padActualMobile("","23");
    }

    static void pad(String p, String up){
        //base condition
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        int digit  = up.charAt(0) - '0'; // it gves integer
        int start = (digit -1) *3;
        int end = (digit * 3) - 1;

        for (int i = start; i <= end; i++) {
            char ch = (char) ('a' + i);
            pad(p+ch, up.substring(1));
        }
    }

    static void padActualMobile(String p, String up){
        //base condition
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        int digit  = up.charAt(0) - '0'; // it gives integer

        int start,end;

        /*
        switch (digit){
            case 7:
                start = (digit -2) *3; //or 15
                end = (digit -1)* 3; //or 18
                break;
            case 8:
                start = ((digit -2) *3) + 1; //or 19
                end = (digit -1)* 3; //or 21
                break;

            case 9:
                start = ((digit -2) *3) + 1; //or 22
                end = ((digit -1)* 3) + 1; //or 25
                break;

            default :
                start = (digit -2) *3;
                end = ((digit -1)* 3) - 1;
        }

        */

        if(digit <= 6){
            start = (digit -2) *3;
            end = ((digit -1)* 3) - 1;
        }else if(digit == 7){
            start = (digit -2) *3; //or 15
            end = (digit -1)* 3; //or 18
        }else if(digit == 8){
            start = ((digit -2) *3) + 1; //or 19
            end = (digit -1)* 3; //or 21
        }
        else{
            start = ((digit -2) *3) + 1; //or 22
            end = ((digit -1)* 3) + 1; //or 25
        }


        for (int i = start; i <= end; i++) {
            char ch = (char) ('a' + i);
            padActualMobile(p+ch, up.substring(1));
        }
    }

}
