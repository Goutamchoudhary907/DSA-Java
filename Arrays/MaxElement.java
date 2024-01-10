public class MaxElement {
    public static void main(String[] args) {
        
        int [] arr= {1,2,5,105,555,459,567,6,88,99,65};
        int ans=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > ans) {
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
}
