class Solution {
public:
    int maxArea(vector<int>& height) {
         int area = 0;
        
        int i = 0; 
        int j = height.size()-1;
        
        while (i<j) {
            
            int side = min(height[i],height[j]);
            area = max(area, (j-i)*side);
            
            if (height[i]<height[j]) {
                i++;
            } else j--;
            
            
        }
        
        return area;
        
    }
};