class Solution {
    public int maxProduct(int[] nums) {
        // int sum = 1;
        // int max = Integer.MIN_VALUE;
        // for(int i =0;i<nums.length;i++){
        //     sum *= nums[i];
        //     max = Math.max(max,sum);
        //     if(sum<0) sum =0;
        // }
        // return max;
        
        int n = nums.length, res = nums[0], low = 0, high = 0;
        for (int i = 0; i < n; i++) {
            low =  (low == 0 ? 1 : low) * nums[i];
            high =  (high == 0 ? 1 : high) * nums[n - 1 - i];
            res = Math.max(res, Math.max(low, high));
        }
        return res;
        
    }
}