class Solution {
public:
   bool containsNearbyAlmostDuplicate(vector<int>& nums, int k, int t) {
        if(nums.size() < 2 || k == 0) return false;
        set<long> windows;       
        int l = 0;               
        for(int i = 0; i < nums.size(); i++){
            if(i - l > k){     
                windows.erase(nums[l++]);
            }
            auto it = windows.lower_bound((long)nums[i] - (long)t);          
            if(it != windows.end() && *it <= ((long)nums[i]+(long)t))    
                return true;
            windows.insert(nums[i]);             // not found
        }
        return false;
        
    }
};