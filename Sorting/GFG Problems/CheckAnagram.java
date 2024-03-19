public class CheckAnagram {

   static int[] freq(String s) {
    int freq[]=new int[26];
    for(int i=0;i<s.length();i++) {
        char ch=s.charAt(i);
        freq[ch-'a'] ++;
    }
    return freq;
   }

    public static boolean isAnagram(String a,String b)
    {
        int [] freqA=freq(a);
        int []freqB= freq(b);
        for(int i=0;i<freqA.length;i++) {
            if(freqA[i] !=freqB[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a="allergy" ;
        String b="allergic" ;
        System.out.println(isAnagram(a, b));
    }
}
