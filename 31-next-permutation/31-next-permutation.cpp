class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        
        // size of nums
        int size = nums.size();
        
        // If size is 1 then do nothing
        if(size == 1)
            return;
        
        // Finding longest increasing subarray from the back
        
        int i;
        for(i = size -2 ; i>=0;i--)
        {
            if(nums[i] >=nums[i+1])continue;
            else
                break;
        }

        // If the entire array is in descending order
        if(i<0) {
            reverse(nums.begin(),nums.end());
            return;
        }
        
        // Finding next greater element than nums[i]
        int j = i+1;
        while(j<size && nums[j]>nums[i])
        {
            j++;
        }
        
        j--;  // Now j is pointing to the element just greater than nums[i]
        
        swap(nums[i],nums[j]);
        reverse(nums.begin()+(i+1),nums.end());

        return ;
        
        
    }
};