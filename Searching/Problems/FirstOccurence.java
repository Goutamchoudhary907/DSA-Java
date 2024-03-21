public class FirstOccurence {

    static int firstOcc(int arr[], int x) {
        int n=arr.length;
        int st=0 , end=n-1;
        int fo=-1;
        while(st <=end) {
            int mid=st +(end-st)/2;
            if(arr[mid]==x) {
            fo=mid;
            end=mid-1;
            }else if(x <arr[mid]) {
               end=mid-1; 
            } else  {
                st=mid+1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
        int arr[]={5,5,5,5,6,2,4};
        int x=5;
        System.out.println(firstOcc(arr, x));
    }
}
