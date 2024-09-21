// This solution is not in O(n) as the original constraints in the leetcode problem page, but hey it's an honest works
class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product *= nums[j];
                }
                res[i] = product;
            }
        }

        return res;
    }
}