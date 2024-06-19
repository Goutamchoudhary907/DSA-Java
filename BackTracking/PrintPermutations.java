import java.util.ArrayList;
import java.util.List;

public class PrintPermutations {

    public static void printp(String str, String t, List<String>l){
        if(str.equals("")) {
           l.add(t);
            return;
        }
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);         //b 
          String left=str.substring(0, i);  //a
        String right=str.substring(i+1);               //c
        String rem=left+right;

        printp(rem,t+ch,l);
    }  
    }

    public void helper(int []nums,  List<Integer> ds,boolean[] isvalid,  List<List<Integer>> ans){
     if(ds.size()==nums.length) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<ds.size();i++){
            list.add(ds.get(i));
        }
        ans.add(list);
        return;
     }
     for(int i=0;i<nums.length;i++){
        if(isvalid[i]==false) {
          ds.add(nums[i]);
          isvalid[i]=true;
          helper(nums, ds, isvalid, ans);
          isvalid[i]=false;
          ds.remove(ds.size()-1);
        }
     }
    }
    public List<List<Integer>> permute(int[]nums){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean[] isvalid=new boolean[nums.length];
        helper(nums,ds,isvalid,ans);
        return ans;
    }
    public static void main(String[] args) {
      String str="abc";
      List<String>l=new ArrayList<>();
      printp(str,"",l);
      System.out.println(l);
    }
}
