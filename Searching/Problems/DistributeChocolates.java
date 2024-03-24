public class DistributeChocolates {
   static boolean isDivisionPossible(int arr[] , int m , int mxChocAllowed) {
    int numberOfStudents=1;
    int choc=0;             // number of choc current student has

    for(int i=0;i<arr.length;i++) {
        if(arr[i] > mxChocAllowed) return false;
        if(choc+arr[i] <= mxChocAllowed) {
           choc +=arr[i]; 
        }  else {
            numberOfStudents++;
            choc =arr[i];
        }
    }
    return numberOfStudents<=m;
    }

    static int distributeChocolates(int arr[] , int m) {
     if(arr.length < m) return -1;
     int ans=0 , st=1 , end=(int)1e9;          // end=10^9

     while(st<=end) {
        int mid=st +(end-st)/2;
        if(isDivisionPossible(arr,m,mid)) {
            ans=mid;
            end=mid-1;
        } else {
            st=mid+1;
        }
     }
     return ans;
    }
    public static void main(String[] args) {
        int arr[]={12,34,67,90};
        int m=2;
        System.out.println(distributeChocolates(arr, m));
    }
}
