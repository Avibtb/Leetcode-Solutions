class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int a = (nums[0]*nums[1]);
        int b = (nums[length-1]*nums[length-2]);
        return Math.abs(a-b);
        
        
    }
}