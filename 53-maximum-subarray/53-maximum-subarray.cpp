class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        
        
        int size = nums.size();
        vector<int> ans(size);
        int sumArray = 0;
        int maxx = INT_MIN;
        for(int i = 0; i<size;i++)
        {
            sumArray += nums[i];
            maxx = max(maxx,sumArray);
            if(sumArray<0)
                sumArray = 0;
        }
        
        return maxx;
    }
};