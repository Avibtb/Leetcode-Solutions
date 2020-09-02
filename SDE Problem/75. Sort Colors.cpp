//I have solved it using Dutch National Flag Algorithm
//Author :- Avinash


class Solution {
public:
    void sortColors(vector<int>& nums) {
        int low =0;
        int hi =nums.size()-1;
        int mid =0;
        while(mid <= hi){
            switch(nums[mid]){
                    
                case 0:
                    swap(nums[low++],nums[mid++]);
                    break;
                    
                case 1:
                    mid++;
                    break;
                    
                case 2:
                    swap(nums[mid],nums[hi--]);
                    break;
            }
            
        }
        
        
        
    }
};