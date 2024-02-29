public class MinimumChangesToMakeAllSubstrDistinct {
    static int minChange(String str) {
        int n = str.length();
        if (n > 26)
            return -1; 

        int distCount = 0;
        int[] count = new int[26]; 

        for (char ch : str.toCharArray()) {
            if (count[ch - 'a'] == 0)
                distCount++;
            count[ch - 'a']++;
        }

        return n - distCount;
    }
    
        public static void main(String[] args) {
            String S = "hnltkrnmjgghyalyen";
            System.out.println(minChange(S));
        }
}
    