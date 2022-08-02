package com.company;

import static java.lang.Math.floor;

public class HW2 {
    public static void main(String[] args) {

        //HW 1
        boolean prime=PrimeCheck(1);
        if (prime){
            System.out.println("the number is prime");
        }else{
        System.out.println("The number is not prime");}

        //HW2
        CalculateTax(159);

        //BONUS
        System.out.println(IsPalindrome("bob"));
    }
    public static boolean PrimeCheck(int a){
        boolean prime=true;
        for (int i = 1; i <= a; i++) {
            if(i==a||i==1){
                continue;}
            if (a%i==0){
                return false;
            }else {
                continue;
            }
        }
        return prime;
    }

    public static void CalculateTax(int price){
        if (price<100||price>500){
            System.out.println("the price is out of range");
            return;
        }
        double tax= price * 15/100;
        System.out.println(tax);
    }
    public static boolean IsPalindrome(String name){
        boolean IsPal=true;
        //even
        if(name.length()%2==0){
            //System.out.println("is even");
            for (int i = 0; i < name.length()/2; i++) {
                if(name.charAt(i)==name.charAt(name.length()-1-i)){
                    continue;
                }else{
                    IsPal=false;
                }
            }
            //odd
        }else{
            //System.out.println("is odd");
            for (int i = 0; i < floor(name.length()/2); i++) {
                if(name.charAt(i)==name.charAt(name.length()-1-i)){
                    continue;
                }else{
                    IsPal=false;

                }
            }
        }

   return IsPal;
    }
}
