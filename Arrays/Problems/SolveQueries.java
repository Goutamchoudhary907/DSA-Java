import java.util.Scanner;

public class SolveQueries {
    
     static int[] makeFrequencyArray(int arr[]) {
        int freq[] =new int [100005];

        for(int i=0;i<arr.length;i++) {
            freq[arr[i]] ++;
        }
        return freq;

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

    int[] freq=makeFrequencyArray(arr);
     System.out.println("Enter number of queries:");
    int q = Sc.nextInt();

   
    while (q>0) {
        System.out.println("Enter number to be search ");
        int x=Sc.nextInt();
         if(freq[x] >0){
            System.out.println("YES");
         }
         else {
            System.out.println("NO");
         }
        q--;
    }
    Sc.close();
    }
}
