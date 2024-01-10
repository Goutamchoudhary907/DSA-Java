public class ArrayReference {
   
    
     
    static void printArray(int [] arr1) {
         for(int i=0;i<arr1.length;i++) {
                System.out.print(arr1[i] +" ");
            }
            System.out.println();
    };


 public static void main(String[] args) {
        
     int [] arr ={1,2,4,5,7,8};
    int [] arr_2 =arr;

    printArray(arr);
    printArray(arr_2);

}
}