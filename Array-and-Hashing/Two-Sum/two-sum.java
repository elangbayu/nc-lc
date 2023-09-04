class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Create empty HashMap
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        // Iterate for the length of nums
        for (int i = 0; i < nums.length; i++) {
            // Save the value of complement (target - current checked value) to be a checker
            int complement = target - nums[i];
            // Check if previous HashMap has checker value (complement value)
            if (hashMap.containsKey(complement)) {
                // If HashMap actually has the value, then return the key as first index, and it's value as second index
                return new int[]{hashMap.get(complement), i};
            }
            // If HashMap doesn't have the value yet, then save the nums[i] as key and i (index) as value
            hashMap.put(nums[i], i);
        }
        // Return empty array if there isn't matching sums
        return new int[]{};
    }
}
