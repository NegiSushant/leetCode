import java.util.HashMap;
import java.util.Map;

public class HashMaps {


    public static void main(String[] args) {
        String input = "Java is programming language.";

        Map<String, Integer> wordCountMap = getUniqueWordCount(input);

        System.out.println("Output: " + wordCountMap);
    }

    public static Map<String, Integer> getUniqueWordCount(String input) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Split the input string into words
        String[] words = input.split("\\s+");

        // Count the occurrences of each word
        for (String word : words) {
            // Remove punctuation from the word (optional)
            word = word.replaceAll("[^a-zA-Z]", "");

            // Convert the word to lowercase to make the count case-insensitive
            word = word.toLowerCase();

            // Update the word count in the map
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }
}
