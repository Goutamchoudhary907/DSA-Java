public class Print {
    static void printArray(int arr[][]) {
         for(int i=0;i<arr.length;i++) {

            for(int j=0;j < arr[i].length ;j++) {
              System.out.print(arr[i][j] +" ");
            }
            System.out.println();
         }
    }
    public static void main(String[] args) {
        
        int arr [] [] = new int [3] [2];

        arr [0] [0] = 5;
        arr [0] [1] = 51;
        
        arr [1] [0] = 32;
        arr [1] [1] = 67;
        
        arr [2] [0] = 55;
        arr [2] [1] = 32;
        

        // int arr[] [] = { {5,51}, {32,67} ,{55,32}  };
      printArray(arr);
    }
}
