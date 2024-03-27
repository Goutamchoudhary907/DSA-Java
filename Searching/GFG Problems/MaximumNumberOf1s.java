public class MaximumNumberOf1s {
    public static int lowBound(int arr[],int n,int x)
    {
      int st=0, end=n-1,ans=n;
      while(st<=end)
      {
          int mid=(end+st)/2;
          if(arr[mid]>=x)
          {
              ans=mid;
              end=mid-1;
          }
          else
          {
              st=mid+1;
          }
      }
         return ans;
      }
    public static int[] findMaxRow(int mat[][], int N) {
        int cnt_max=-1,index=-1;
        for(int i=0;i<N;i++)
        {
        int cnt_one=N-lowBound(mat[i],N,1);
        if(cnt_one>cnt_max)
        {
            cnt_max=cnt_one;
            index=i;
        }
        }
          return new int[]{index,cnt_max};
       }
   
    public static void main(String[] args) {
      int arr[][]=  {{0, 0, 1}, 
                     {0, 1, 1}, 
                     {0, 0, 0}} ;
             int ans[]=findMaxRow(arr,arr.length);   
             for(int i:ans) {
                System.out.print(i+" ");
             }     
    } 
}
