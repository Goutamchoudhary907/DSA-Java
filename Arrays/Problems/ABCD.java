// import java.util.Scanner;

// public class ABCD {
// static int[] topKFrequent(int arr[]) {
//     int freq[] =new int[arr.length];
//     for(int i=0;i<arr.length;i++) {
//         for(int j=i;j<arr.length;j++) {
//             if (arr[i] == arr[j]) {
//                 freq[i]++;
//             }
//         }
//     }
//     return freq;
// }
//     public static void main(String[] args) {
//          Scanner Sc = new Scanner(System.in);
//         System.out.println("Enter Size of Array:");
//         int size = Sc.nextInt();
//         int arr[] = new int[size];
//         System.out.println("Enter Elements of Array:");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = Sc.nextInt();
//         }
//         System.out.println("Enter k :");
//         int k = Sc.nextInt();
//         Sc.close();
//      int freq[] =topKFrequent(arr);
//      for(int i:freq) {
//         System.out.println(i);
//      }
//     }
// }