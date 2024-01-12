/*
 * Return the first value that is repeating in this array if no value is repeated return -1
 */

import java.util.Scanner;

 public class FindRepetingElement {
    static int repeatedValue(int [] arr) {                       //     static int repeatedValue(int [] arr) {                                                        
        int ans=-1;                                              //         for(int i=0;i<arr.length;i++){
        outer: for(int i=0;i<arr.length;i++){                    //          for(int j=i+1;j<arr.length;j++){
             for(int j=i+1;j<arr.length;j++){                    //           if (arr[i]==arr[j]) {
        if (arr[i]==arr[j]) {                                    //             return arr[i];
            ans= arr[i];                                         //           }
            break outer;                                         //         }
                    }                                            //     }
                }                                                //     return -1;
            }                                                    // }
          return ans;                                            // Whenever we return value in any block whole mehtod is terminate at this point
         }                                                       // And if no element is repeated return -1 at last


     public static void main(String[] args) {
    Scanner Sc =new Scanner(System.in);
    System.out.println("Enter Size of Array:");
    int size = Sc.nextInt();

    int arr [] =new int [size];

    System.out.println("Enter Elements of Array:");
    for(int i=0;i<arr.length;i++) {
       arr[i]= Sc.nextInt();
    }
    Sc.close();

    int value=repeatedValue(arr);
    if (value >0) {
        System.out.println("Repeated element is :" + value);
    }
    else {
    System.out.println("return" +value); 
    }
     }
}
