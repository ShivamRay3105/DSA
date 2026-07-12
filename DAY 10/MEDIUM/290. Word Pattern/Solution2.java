import java.util.HashMap;

class Solution2 {
    public boolean wordPattern(String pattern, String s) {
        String[] sentence = s.split(" ");
        if (pattern.length() != sentence.length) {
            return false;
        }
        // Solution using one hashmap to store the mapping of character to word
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(sentence[i]))
                    return false;
            } else if (map.containsValue(sentence[i]))
                return false;
            else
                map.put(pattern.charAt(i), sentence[i]);
        }
        return true;
    }
}