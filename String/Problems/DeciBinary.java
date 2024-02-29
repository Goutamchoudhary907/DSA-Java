/*
 *  A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros.
 *  For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.
    Given a string n that represents a positive decimal integer, return the minimum number of positive deci-binary 
    numbers needed so that they sum up to n.  (Leetcode 1689)
 */

import java.util.Scanner;
public class DeciBinary {
    static int minPartitions(String n) {
        int max = -1;
        char[] c = n.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (max < c[i] - '0')
                max = c[i] - '0';
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter string of numbers:");
        String n = Sc.nextLine();
        Sc.close();
        System.out.println(minPartitions(n));
    }
}
