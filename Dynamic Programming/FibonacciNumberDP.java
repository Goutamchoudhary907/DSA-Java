public class FibonacciNumberDP {

    public static int fib(int n) {           // bottom up approach 
        int arr[] = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public static int fib2(int n){            // top down appraoch 
        int arr[]=new int[n+1];

        if(arr[n]==0){
            if(n<2) {
                arr[n]=n;      // for 0 and 1 
            } else {
                int left=fib2(n-1);
                int right=fib2(n-2);
                arr[n]=left+right;
            }
        }
        return arr[n];
    }
    public static void main(String[] args) {
       // 0 1 1 2 3 5 8  
        int n = 6 ;
        System.out.println(fib(n));

        System.out.println(fib2(n));
    }
}