public class MultiArrayCreation {
    public static void main(String[] args) {
        
        int arr [] [] = new int [3] [2];

        arr [0] [0] = 5;
        arr [0] [1] = 51;
        
        arr [1] [0] = 32;
        arr [1] [1] = 67;
        
        arr [2] [0] = 55;
        arr [2] [1] = 32;
        

        // int arr[] [] = { {5,51}, {32,67} ,{55,32}  };
        for(int i=0;i<3;i++) {
            for(int j=0;j<2;j++) {

                System.out.println(arr[i][j]);
            }
        }
    }
}
