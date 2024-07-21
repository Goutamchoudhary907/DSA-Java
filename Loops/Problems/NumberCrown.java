public class NumberCrown {
    public static void numberCrown(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i){
                System.out.print(j+" ");     
                } else {
                 System.out.print(" ");
                }
               
            }
            for(int k=n;k>=1;k--){
                if(k<=i){
                System.out.print(k+" ");     
                } else {
                 System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
         int n=3;
         numberCrown(n);
    }
}
