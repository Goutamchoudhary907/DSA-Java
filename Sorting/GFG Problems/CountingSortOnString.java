public class CountingSortOnString {
    public static String countSort(String arr)
    {
        int count[]=new int[26];
        StringBuilder sb=new StringBuilder();
  for(char c:arr.toCharArray()) {
  count[c-'a']++;
  }
  for(int i=0;i<26;i++) {
    while(count[i]>0) {
        sb.append((char)('a'+i));
        count[i]--;
    }
  }
    return sb.toString();
     }
     public static void main(String[] args) {
        String S="edsab";
        System.out.println(countSort(S));
     }
}
