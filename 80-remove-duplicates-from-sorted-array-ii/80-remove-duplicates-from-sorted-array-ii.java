class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0, count = 1, cur = nums[0];
        for (int r = 1; r < nums.length; r++) {
            if (nums[r] == cur) {
                count++;  
            } else {
                count = 1;
                cur = nums[r];
            }
            if (count <= 2) {   
                l++;
                nums[l] = nums[r];
            }
        }
        
        return l + 1;
        
    }
}