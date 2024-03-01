import java.util.HashMap;

public class MostCommonWord {
    public void mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        String[] words = paragraph.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String i : words) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
      
    }
}
// Have to complete this 