public class TwoStringAnagram {
   static int minSteps(String s, String t) {
        int ans=0;
     int[] freqS=new int[26];
     int []freqT=new int[26];
    for(char ch: s.toCharArray()) {
        freqS[ch-'a'] ++;
    }
    for(char ch:t.toCharArray()) {
        freqT[ch-'a'] ++;
    }
     for(int i=0;i<26;i++) {
      ans +=Math.abs(freqS[i] - freqT[i]);
     }
     return ans;
    }
  public static void main(String[] args) {
     String s="leetcode";
     String t="coats";
   System.out.println(minSteps(s, t));
  }
}
