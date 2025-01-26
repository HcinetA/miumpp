package MPP.lab8.prob4;

import java.util.Arrays;
import java.util.List;

public class wordCounter {

    public static void main(String[] args) {

    wordCounter wordcounts = new wordCounter();

    List<String> words = Arrays.asList("hello", "world", " nirmal", "silwal", "zebra");
    char c = 'l';
    char d = 'z';
    int len = 5;
        System.out.println("word count is: " + wordcounts.countWords(words, c, d, len));

}

public int countWords(List<String> words, char c, char d, int len) {
    int[] count = {0};
    words.forEach(currentWord -> {
        if (currentWord.length() == len && containsChar(currentWord, c) && !containsChar(currentWord, d)) {
            count[0]++;
        }
    });
    return count[0];
}

private boolean containsChar(String currentWord, char c) {
    for (char ch : currentWord.toCharArray()) {
        if (ch == c)
            return true;
    }
    return false;
}
}