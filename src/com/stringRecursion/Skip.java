package com.stringRecursion;

public class Skip {

    public static void main(String[] args) {

        // skip characters
        String str = "bcaccadf";
        skip(str,"");

        System.out.println("ans is "+skip2(str));

        // reverse
        System.out.println("reverse is "+reverse("abcd"));

        // skip sentence
        System.out.println("skiped sentence ans is "+skipSentence("bcdapplegh"));

        //skip string if its not the requires tring
        //e.g if string is (app) and required string is (apple) , so if you found app but is should not be apple then you can skip app

        System.out.println("skip app apple first test "+skipAppApple("abcappledfg"));
        System.out.println("skip app apple second test "+skipAppApple("abcappdfg"));
    }

    private static String skipAppApple(String str) {
        //base condtion
        if(str.isEmpty()){
            return "";
        };
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipAppApple(str.substring(3));
        }else{
            return str.charAt(0)+skipAppApple(str.substring(1));
        }
    }

    private static String skipSentence(String str) {
        // base condition
        if(str.isEmpty()){
            return "";
        };
        if(str.startsWith("apple")){
            return skipSentence(str.substring(5));
        }else{
            return str.charAt(0)+skipSentence(str.substring(1));
        }
    }

    private static String reverse(String str) {
        // base condition
        if(str.isEmpty()){
            return "";
        };
         String lastChar = str.substring(str.length() -1);
         String remaining = str.substring(0,str.length() - 1);
         return lastChar + reverse(remaining);
    }

    private static String skip2(String str) {
        //base condition
        if(str.isEmpty()){
            return "";
        };
        char firstChar = str.charAt(0);
        String remaining = str.substring(1);

        if(firstChar != 'a'){
            return firstChar+skip2(remaining);
        }else{
            return skip2(remaining);
        }

    }

    //method 1 : passing ans as arguments
    private static void skip(String str,String ans) {
        //base condition
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char firstChar = str.charAt(0);
        String remaining = str.substring(1);
        if(firstChar != 'a'){
            skip(remaining,ans+firstChar);
        }else{
            skip(remaining,ans+"");
        }
    }
}
