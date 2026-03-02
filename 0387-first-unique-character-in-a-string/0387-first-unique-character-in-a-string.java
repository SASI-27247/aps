import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * Finds the index of the first non-repeating character in the string.
     * 
     * @param s The input string, consisting of only lowercase English letters.
     * @return The index of the first non-repeating character, or -1 if none exists.
     */
    public int firstUniqChar(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (counts.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
