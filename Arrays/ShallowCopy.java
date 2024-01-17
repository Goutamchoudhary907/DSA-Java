public class ShallowCopy {
    
    static void printArray(int [] arr1) {
         for(int i=0;i<arr1.length;i++) {
                System.out.print(arr1[i] +" ");
            }
            System.out.println();
    }


 public static void main(String[] args) {
        
     int [] arr ={1,2,4,5,7,8};
    int [] arr_2 =arr;

    System.out.println("Original array:");
    printArray(arr);
    System.out.println("Copied array:");
    printArray(arr_2);

    // Changing some values of array two 
    arr_2[0]=0;                                      // this make changes in original array because it changes the array present on this reference  
    arr_2[1]=0;                                      // and we only give same reference to both the array not generate actual copy of original array

     System.out.println("Original array after changing arr_2:");
    printArray(arr);
    System.out.println("Copied array after changing arr_2:");
    printArray(arr_2);

}
}