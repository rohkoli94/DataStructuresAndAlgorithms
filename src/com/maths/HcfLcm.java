package com.maths;

public class HcfLcm {

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 7;


        hcf(n1,n2);
        lcm(n1,n2);
    }

    static void hcf(int n1,int n2){

        for (int i = (n1>n2?n2:n1); i >=1 ; i--) {
            if( (n1%i == 0) && (n2%i ==0) ){
                System.out.println("hcf is "+i);
                break;
            }
        }
    }

    static void lcm(int n1,int n2){
        int i,lower,upper;
        if(n1>n2){
            upper = n1;
            lower = n2;
        }else{
            upper = n2;
            lower = n1;
        }
        boolean found = false;
        for (i = upper; i <= n1*n2 ; i=i+upper) {
            if(upper%i ==0 &&  i%lower==0){
                found = true;
                System.out.println("lcm is "+i);
                break;
            }
        }
        if(!found){
            System.out.println("lcm is "+n1*n2);
        }
    }
}
