class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int low = 0, high = nums.length-1;
        for(int i = high ; i>=0;i--){
            if(Math.abs(nums[low]) >= Math.abs(nums[high])){
                ans[i] = nums[low]*nums[low];
                low++;
            }
            else{
                ans[i] = nums[high]*nums[high];
                high--;
            }
        }
        return ans;
        
    }
}