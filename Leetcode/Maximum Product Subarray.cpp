class Solution {
public:
    int maxProduct(vector<int>& nums) {
        if(nums.size()==0)
    {
        return 0;
    }
    
    int prev_max=nums[0];
    int prev_min=nums[0];
    int current_max=nums[0];
    int current_min=nums[0];
    int ans=nums[0];
    
    for(int i=1;i<nums.size();i++)
    {
        current_max=max(prev_max*nums[i],max(prev_min*nums[i],nums[i]));
        current_min=min(prev_max*nums[i],min(prev_min*nums[i],nums[i]));
        ans=max(ans,current_max);
        prev_max=current_max;
        prev_min=current_min;
    }
    return ans;
    
    
}
        
};