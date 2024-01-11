import java.util.Arrays;

public class CopyOfArray {

    static void printArray(int [] arr1) {
        for(int i=0;i<arr1.length;i++) {
               System.out.print(arr1[i] +" ");
           }
           System.out.println();
   }


public static void main(String[] args) {
       
    int [] arr ={1,2,4,5,7,8};
   int [] arr_2 =Arrays.copyOf(arr , arr.length);             // this method require two parameters one original array and other is length
                                                              //  of new array that how many element you want to copy 

   System.out.println("Original array:");
   printArray(arr);
   System.out.println("Copied array:");
   printArray(arr_2);

  int [] arr_3 = Arrays.copyOfRange(arr, 0, 4);        // This copy in any particular range where start index 
                                                              //  is included and end index is excluded 

  System.out.println("3rd Array:");
  printArray(arr_3);
}
}
