class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();
        
        if( n == 0) 
        {
             return 0;
        }
        
        vector<int> prefix(n);
        
        prefix[0] = height[0];
        for(int i = 1;i<n;i++)
        {
            prefix[i] = max(prefix[i-1],height[i]);
        }
        
        vector<int> suffix(n);
        suffix[n-1] = height[n-1];
        
        for(int i = n-2;i>=0;i--)
        { 
            suffix[i] = max(suffix[i+1],height[i]);
        }
        
        int amount = 0;
        for(int i = 1; i<n-1;i++)
        {
            int h1 = prefix[i-1];
            int h2 = suffix[i+1];
            
            int decide_h = min(h1,h2);
            if(decide_h > height[i]){
                amount += (decide_h - height[i]);
            }
        }
        return amount;
        
    }
};