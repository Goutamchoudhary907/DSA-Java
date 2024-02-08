public class SortCharByFrequency {
    static String frequencySort(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        // Create an array of buckets to store characters by frequency
        int[] freq = new int[128]; // Assuming ASCII characters

        // Count character frequencies
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            while (freq[i] > 0) {
                result.append((char) i);
                freq[i]--;
            }
        }
        return result.reverse().toString(); // Reverse to get descending order
    }

    public static void main(String[] args) {
        String s= "tree";
        System.out.println(frequencySort(s));
    }
}
