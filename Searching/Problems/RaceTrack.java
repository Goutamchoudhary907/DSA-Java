public class RaceTrack {

    static boolean isPossible(int arr[] , int m, int dist) {
      int kidsplaced=1;
      int lastKid=arr[0];
      for(int i=0;i<arr.length;i++) {
        if(arr[i] - lastKid >=dist) {
            kidsplaced ++;
            lastKid=arr[i];
        }
       }
       return kidsplaced >=m;
    }

    static int raceTrack(int arr[] , int m) {
    if(m > arr.length) return -1;

    int st=0 , end=(int)1e9 , ans=-1;
    while(st<=end) {
    int mid= st+ (end-st)/2;
     if(isPossible(arr, m,mid))  {            // can m kids placed such that no 2 kids have distance lesser than mid
       ans=mid;
       st=mid+1;
     } else {
      end=mid-1;
     }
    }
    return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,8,9};
        int m=3;
     System.out.println(raceTrack(arr, m));
    }
}
