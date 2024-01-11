    import java.util.Scanner;
public class ElementsGreaterThanX {

    static int greaterThan(int [] arr, int x) {
            int count= 0;
   
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > x) {
              count ++;
            }
        }
         return count;
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
        System.out.println("Enter element to check greater elements than this:");
        int x = Sc.nextInt();
        Sc.close();
        
    System.out.println("Number of elements greater than " + x + " is :" + greaterThan(arr, x));
      
    }
}


