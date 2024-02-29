import java.util.ArrayList;
import java.util.Scanner;

public class Subsequences {
    static ArrayList<String> subsequence(String s) {
    ArrayList <String> ans=new ArrayList<>();
      if (s.length()==0) {
        ans.add("") ;
        return ans; 
      }
        char curr=s.charAt(0);
        ArrayList<String> smallAns=subsequence(s.substring(1));
        for(String ss: smallAns) {
         ans.add(ss); 
         ans.add(curr +ss); 
        }
        return ans;
    }
  public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter String:");
    String s=Sc.nextLine();
    Sc.close();
    ArrayList<String> ans =subsequence(s);
    for(String ss:ans) {
        System.out.println(ss);
    }
  } 
}
