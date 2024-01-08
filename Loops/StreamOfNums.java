import java.util.Scanner;

public class StreamOfNums {
    public static void main(String[] args) {
        
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter Number");
        int num= Sc.nextInt();
        int sum=0;
        
        while (num!=-1) {
            sum+=num;
            num=Sc.nextInt();
        }

        System.out.println(sum);
        Sc.close();
    }
}

/*
 * if we write same code using do-while it gives output -1 even if in the first time we give input -1
 * 
 * do {
 * sum+=num;
 * num=Sc.nextInt();
 * } while (num!=-1) ;
 * 
 * 
 */