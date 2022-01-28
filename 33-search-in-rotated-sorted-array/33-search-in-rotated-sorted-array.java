class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = start + ( end - start) / 2;
             
            // Condition to check that target value is present at mid only.
            if(target == nums[mid]){
                return mid;
            }
            
            
            // Condition to check that target is persent between and start and mid only
            if(nums[start] <= nums[mid]){
                if(target < nums[mid] && target >= nums[start]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
                
            }
            
            
            // Condition to check that target is present between mid and end only
            if(nums[mid] <= nums[end]){
                if(target <= nums[end] && target > nums[mid] ){
                    start = mid + 1;
                    
                }
                else{
                     end = mid - 1;
                }
            }
        }
        return -1;
        
        
        
      
        
    }
}