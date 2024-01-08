/*
 * Program to find sum of digits of any number 
 * first we take modulus of number with 10 
 * example 765%10 = 5 then we divide 765 by 10 so its last digit is discard now the number is 76
 * again we take modulus 76 % 10 =6  then follow same again 
 */

import java.util.Scanner;

public class SumOfDigitsOfNumber {
  
    public static void main(String[] args) {
        
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int n = Sc.nextInt();
        Sc.close();

        int original_n=n;                          // to store original value of n beacuse in loop we change the value of 
        int sum=0;

        while (n>0) {
            sum+= n%10;                            // first we store %10 of a number then
            n=n/10;                                // we divide n by 10 its one digit is reduce
            

        }
        System.out.println("Sum Of Digits in " + original_n + "=" + sum);
    }
}

