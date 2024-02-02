import java.util.ArrayList;
import java.util.List;

public class WordsContainingCharacter {
    static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.indexOf(x) != -1) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = { "leet", "code" };
        char x = 'e';
        System.out.println(findWordsContaining(words, x));
    }
}
