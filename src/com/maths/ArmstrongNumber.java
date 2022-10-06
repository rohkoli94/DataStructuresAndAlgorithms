package com.maths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;

        arm(num);

    }

    static void arm(int n){
        int temp = n;
        int ans = 0;
        if(n==0 || n==1){
            System.out.println("armstrong");
            return;
        }
        while(n > 0){
            int rem = n%10;
            ans = ans + (rem*rem*rem);
            n = n/10;
        }
        if(ans == temp){
            System.out.println("armstong");
        }else{
            System.out.println("not an armstong");
        }
    }
}
