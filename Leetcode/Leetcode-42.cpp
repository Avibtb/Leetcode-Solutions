/*  Ques link => https://leetcode.com/problems/trapping-rain-water/
*  
*   Ques name =>  Trapping Rain Water */

// Solution //

class Solution {
public:
    int trap(vector<int>& height) {
    int n = height.size();
    int left = 0;
    int right = n-1;
    int l_max = 0;
    int r_max = 0;
 
    int result = 0;
    while (left <= right)
    {

      if(r_max <= l_max)
      {
  

        result += max(0, r_max-height[right]);
  
        
        r_max = max(r_max, height[right]);
  
        right -= 1;
      }
      else
      {
  
      
        result += max(0, l_max-height[left]);
 
        l_max = max(l_max, height[left]);
  
        left += 1;
      }
    }
    return result;
        
    }
};