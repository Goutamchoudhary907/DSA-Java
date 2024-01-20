import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    static void printArray(int arr[]) {
                for(int i=0;i<arr.length;i++) {
                    System.out.println(arr[i]);
                }
            }
    static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
               
           }
           public static void main(String[] args)
	{
        Scanner Sc = new Scanner(System.in);
    System.out.println("Enter Size of Array:");
    int size = Sc.nextInt();

    int arr[] = new int[size];

    System.out.println("Enter Elements of Array:");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Sc.nextInt();
    }
    Sc.close();
    Arrays.sort(arr);
    int j=removeDuplicates(arr);
    System.out.println("J:"+j);  
}
}