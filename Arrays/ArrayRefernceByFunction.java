public class ArrayRefernceByFunction {
    
    static void changeArray(int [] arr)
    {
        for(int i=0;i<arr.length;i++) {
            arr[i] =0;
        }
    }

    static void changeVal(int a)
    {
        a=1024;
    }

    static void printArray(int [] arr1) {
        for(int i=0;i<arr1.length;i++) {
               System.out.print(arr1[i] +" ");
           }
           System.out.println();
   }

    public static void main(String[] args) {
        int a=5;
        changeVal(a);                      // this function can not change actual value of a it only change copy of a 
                                           // because in case of primitive Data structures ,nothing is created on heap area   
        System.out.println(a);

        int [] arr={1,2,4,6,7,8};

        changeArray(arr);                  // Here we expect same that array does not change by changeArray function 
                                           // but this also change original array because this function take copy of refernce variable
                                           // not copy of actual array   
        printArray(arr);
    }
}
