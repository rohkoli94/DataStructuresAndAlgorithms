package com.revision3.strings;

public class Stringsquestions {

    public static void main(String[] args) {
        String s = "abcdabs";
        char skip = 'a';
        System.out.println(skipChar(s,skip));

        System.out.println(reverse("abc"));

        System.out.println(skipsentence("abcappledef"));

        System.out.println(skipReqsentence("appbad"));
        System.out.println(skipReqsentence("aapplebad"));

    }
    private static String skipReqsentence(String up) {
        // base condition
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipReqsentence(up.substring(3));
        }
        return  up.charAt(0)+skipReqsentence(up.substring(1));
    }
    private static String skipsentence(String up) {
        // base condition
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipsentence(up.substring(5));
        }
        return  up.charAt(0)+skipsentence(up.substring(1));
    }

    private static String reverse(String up) {
        // base condition
        if(up.isEmpty()){
            return "";
        }
        String ch = up.substring(up.length() - 1);
        return ch+reverse(up.substring(0,up.length() - 1));
    }

    private static String skipChar(String up,char skip) {
        // base condition
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == skip){
            return skipChar(up.substring(1),skip);
        }
        return ch +skipChar(up.substring(1),skip);
    }
}
