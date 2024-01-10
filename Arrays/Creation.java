public class Creation {
public static void main(String[] args) {
    
    int[] arr =new int[5];
    arr[0]= 5;
    arr[1]= 6;
    arr[2]= 8;
    arr[3]= 3;
    arr[4]= 16;
   
    for(int i=0;i<5;i++) {
        System.out.println(arr[i]);
    }

    String[] names= {"Rahul","Raj" ,"Rohit"};

    System.out.println("Names:");
  for(int i=0;i<3;i++) {
        System.out.println(names[i]);
    }

    for (int array : arr) {
        System.out.println(array);
    }
}    
}
