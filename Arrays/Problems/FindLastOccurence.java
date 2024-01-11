import java.util.Scanner;

public class FindLastOccurence {
    static int lastOccurence(int [] arr, int x) {
            int ans= -1;
   
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == x) {
             ans =i;
            }
        }
         return ans;
        }
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int size = Sc.nextInt();

        int arr [] =new int [size];

        System.out.println("Enter Elements of Array:");
        for(int i=0;i<arr.length;i++) {
           arr[i]= Sc.nextInt();
        }
        System.out.println("Enter element to check last Occurence:");
        int x = Sc.nextInt();
        Sc.close();
        
        int lastIndex= lastOccurence(arr, x);
        if(lastIndex==-1) {
            System.out.println("Element not pesent in array");
        }
        else {
      System.out.println("Last occurence at index : " + lastIndex );
        }
    }
}
