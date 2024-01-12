import java.util.Scanner;

public class ReverseArrayUsing2nd {
    
     static int[] reverseArray(int arr[]){
        int j=0;
        int n=arr.length;
        int[] ans= new int[n];
        for(int i=n-1; i>=0;i--) {
            ans[j++] = arr[i];
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
        Sc.close();
        int ans[]=reverseArray(arr);
        System.out.println("Reversed array :");
        for(int i=0;i<ans.length;i++){
        System.out.println(ans[i]);
        }
}
}