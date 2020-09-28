class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
         if (k <= 1) return 0;
        int count = 0, left = 0, right = 0, prod = 1;
        while (right < nums.length) {
            prod *= nums[right];
            while (prod >= k) prod /= nums[left++];
            count += 1 + (right - left);
            right++;
        }
        return count;
        
    }
}