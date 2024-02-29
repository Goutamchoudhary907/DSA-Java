public class EvenAndOdd {
    static void reArrange(int[] arr, int N) {
        int oddInd = 1; // index for odd elements
        int evenInd = 0; // index for even elements
        while (true) { // continue until no more swaps can be made
            while (evenInd < N && arr[evenInd] % 2 == 0) // find next even number
                evenInd += 2; 
                  
            while (oddInd < N && arr[oddInd] % 2 == 1) // find next odd number
                oddInd += 2; 
                  
            if (evenInd < N && oddInd < N) { // if both even and odd numbers exist
                int temp = arr[evenInd]; 
                arr[evenInd] = arr[oddInd]; // swap even and odd elements
                arr[oddInd] = temp;
            } else {
                break; // no more swaps can be made, exit the loop
            } 
        } 
    }
 
  
  public static void main(String[] args) {
    int arr[]={3,6,12,1,5,8};
    reArrange(arr, arr.length);
  }
}