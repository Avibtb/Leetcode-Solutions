class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] =  new int[2];
        ans[0] =  helper(nums,target , true);
        ans[1] = helper(nums, target, false);
        return ans;
    }
    
    private int helper(int[] arr, int target, boolean flag)
    {
        int low = 0;
        int end = arr.length - 1;
        int i = -1;
        while(low <= end){
            int mid = low + (end - low) / 2;
            if(target < arr[mid] || flag && target == arr[mid]){
                end = mid - 1;
            }
            else{
                low = mid+1;
            }
            if(arr[mid] == target)
                i = mid;
            
        }
        return i;
        
    }
}