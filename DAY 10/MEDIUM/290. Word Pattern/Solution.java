import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sentence = s.split(" ");
        if (pattern.length() != sentence.length) {
            return false;
        }

        // Solution using two hashmaps to store the mapping of word to character and
        // character to word
        HashMap<String, Character> wordToChar = new HashMap<>();
        HashMap<Character, String> charToWord = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (charToWord.containsKey(pattern.charAt(i)) && !charToWord.get(pattern.charAt(i)).equals(sentence[i])) {
                return false;
            }
            if (wordToChar.containsKey(sentence[i]) && wordToChar.get(sentence[i]) != pattern.charAt(i)) {
                return false;
            }

            wordToChar.put(sentence[i], pattern.charAt(i));
            charToWord.put(pattern.charAt(i), sentence[i]);

        }
        return true;
    }
}