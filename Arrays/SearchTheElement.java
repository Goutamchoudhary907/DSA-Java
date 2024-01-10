import java.util.Scanner;

public class SearchTheElement {
public static void main(String[] args) {
    
    int [] array={1,3,5,7,7,9,76,54};
    System.out.println("Enter element to search");
    Scanner Sc=new Scanner(System.in);
    int element=Sc.nextInt();
    Sc.close();
    int ans=-1;

    for(int i=0;i<array.length;i++)
    {
        if(array[i] == element)
        {
          ans=i;
          break;

        }
    }
    if(ans==-1)
        {
        System.out.println("Element "+ element+ "not found");
        
        }
     else {
        System.out.println("Element " + element+ " found at index" + ans);
        }
}
    
}