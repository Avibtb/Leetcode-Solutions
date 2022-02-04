class Solution {
    public int maxArea(int[] height) {
         int area = 0;
        
        int i = 0; 
        int j = height.length-1;
        
        while (i<j) {
            
            int side = Math.min(height[i],height[j]);
            area = Math.max(area, (j-i)*side);
            
            if (height[i]<height[j]) {
                i++;
            } else j--;
            
            
        }
        
        return area;
        
    }
}