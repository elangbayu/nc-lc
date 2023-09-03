class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            charCount.put(charS, charCount.getOrDefault(charS, 0) + 1);
            charCount.put(charT, charCount.getOrDefault(charT, 0) - 1);
        }

        for (int count : charCount.values()) {
            if (count != 0) return false;
        }

        return true;
    }
}
