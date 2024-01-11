import java.util.Scanner;

public class OccurenceOfElement {

    static int countOccurence(int [] arr, int x) {
            int count=0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] == x) {
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
        System.out.println("Enter element to search:");
        int x = Sc.nextInt();
        Sc.close();

      System.out.println("Element occurence:" + countOccurence(arr, x));

    }
}
