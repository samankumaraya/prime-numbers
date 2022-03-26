package codin;

import java.util.Scanner;

public class Main {

   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter your first number :");
       int start=sc.nextInt();
       System.out.println("Enter your end number :");
       int end=sc.nextInt();

       System.out.println("The prime numbers between"+start+"and"+end);

       for(int i=start;i<=end;i++){
           if(isprimeornot(i)){
               System.out.println(i);
           }
       }

   }
   public static boolean isprimeornot(int n){
       if(n<=1){
           return false;
       }
       for(int i=2;i<=Math.sqrt(n);i++){
           if(n%i==0){
               return false;
           }
       }
       return true;

   }
    }