class Solution {
    
    public void swap(int[] nums , int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int low = 0, end = nums.length - 1, i = 0;
        while(i<=end){
            if(nums[i] == 0){
                swap(nums, low++, i++);
            }
            else if(nums[i] == 2){
                swap(nums , end-- , i);
            }
            else
                i++;
        }
    }
}