class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
       int result = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
    
    for (int start = 0; start < nums.length - 2; start++) {
        int middle = start + 1;
        int end = nums.length - 1;
        while (middle < end) {
            int sum = nums[start] + nums[middle] + nums[end];  
            if (sum == target) {
                return target;
            } else if (sum > target) {
                 end--;
            } else {
                middle++;
            }
            if (Math.abs(sum - target) < Math.abs(result - target)) {
                result = sum;
            }
        }
    }
    return result;
        
        
    }
}