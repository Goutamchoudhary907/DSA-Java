// find second largest and second smallest element 
import java.util.ArrayList;
// import java.util.Arrays;
public class IshwarProposals {
    static ArrayList <Integer> acceptedProposals (int arr[], int n)
    {
        ArrayList<Integer> l=new ArrayList<>();
      int max=secondMax(arr);
      int min=secondMin(arr);
      l.add(max);
      l.add(min);
        return l;
    }
    static int findMax(int arr[]) {
        int max=Integer.MIN_VALUE;
    
        for(int i=0;i<arr.length;i++) {
            if(arr[i] >max) {
                max=arr[i];
            }
        }
        return max;
    }
    static int secondMax(int arr[]) {
        int max=findMax(arr);
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==max) {
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondmax=findMax(arr);
        return secondmax;
    }

    // static int findMin(int arr[]) {
    //     int min=Integer.MAX_VALUE;
    //     for(int i=0;i<arr.length;i++) {
    //         if(arr[i] <min) {
    //         min=arr[i];
    //         }
    //     }
    //     return min;
    // }
    // static int secondMin(int arr[]) {
    //     int min = findMin(arr);
    //     int secondMin = Integer.MAX_VALUE;

    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] > min && arr[i] < secondMin) {
    //             secondMin = arr[i];
    //         }
    //     }

    //     return secondMin;
    // }
    static int findMin(int arr[] ){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] <min) {
             min =arr[i] ;                
            }
        }
     return min;
    }

 static int secondMin(int arr[]) {
    int min=findMin(arr);
    for(int i=0;i<arr.length;i++) {
        if (arr[i] == min) {
            arr[i] =Integer.MAX_VALUE;
        }
    }
    int secondmin=findMin(arr);
    return secondmin;

 }
    // static ArrayList <Integer> acceptedProposals2 (int arr[], int n)
    // {
    //     ArrayList<Integer> l=new ArrayList<>();
    // Arrays.sort(arr);
    //  l.add(arr[1]);
    //  l.add(arr[n-2]);
    //  return l;
    // }
public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    System.out.println(acceptedProposals(arr, arr.length));
}
}
