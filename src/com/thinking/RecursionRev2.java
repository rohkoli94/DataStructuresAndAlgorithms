package com.thinking;

public class RecursionRev2 {

    public static void main(String[] args) {
        int n = 5;
        int ans = sumUpto(n);
        System.out.println("ans is "+ans);

        int num  = 1234;
        System.out.println("rev is "+rev(num));
    }

    private static int rev(int num) {
        //bc
        if(num == 0){
            return 0;
        }
        int noOfdigits = (int)Math.log10(num) + 1;
        int pow = calPow(noOfdigits);
        return  num %10 * pow + rev(num/10);
    }

    private static int calPow(int noOfdigits) {
        /*
        *  0 0
        *  1 1
        * 2 10
        * 3 1000
        * 4 10000
        * */
        if(noOfdigits == 0){
            return  0;
        };
        if(noOfdigits == 1){
            return  1;
        }
        int ans = 1;

        for (int i = 2; i <= noOfdigits ; i++) {
            ans = ans *10;
        }
        return ans;
    }

    private static int sumUpto(int n) {
        //bc
        if(n == 0){
            return 0;
        }
        return n+sumUpto(n-1);
    }


}
