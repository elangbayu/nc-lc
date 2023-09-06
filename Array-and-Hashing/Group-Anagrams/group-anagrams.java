class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Using HashMap to mapping each unique and sorted characters
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Sort each word so if there is anagram, we can add it to existing key
            char[] count = s.toCharArray();
            Arrays.sort(count);
            String sorted = new String(count);

            // Check if the word is already inserted into HashMap
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            // Add actual word from given string to the list of specified key
            map.get(sorted).add(s);
        }

        // return the values of HashMap as List
        return new ArrayList<>(map.values());
    }
}
