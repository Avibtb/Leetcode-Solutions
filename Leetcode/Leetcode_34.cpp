/*
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
*
*
*/


// SOLUTION //


class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int leftt = left(nums,target);
        int rightt = right(nums,target);
       return leftt <= rightt ? vector<int>{leftt, rightt} : vector<int>{-1,-1};
        
    }
    int left(vector<int>& nums, int target){
        int l = 0;
        int r = nums.size()-1;
        int mid ;
        while ( l <= r )
		{
			mid = (r + l) / 2;
			if ( nums[mid] < target) l = mid + 1;
			else r = mid - 1;
		}
        return l;
    }
     int right(vector<int>& nums, int target){
        int l = 0;
        int r = nums.size()-1;
        int mid ;
        while ( l <= r )
		{
			mid = (r + l) / 2;
			if ( nums[mid] <= target) l = mid + 1;
			else r = mid - 1;
		}
        return r;
    }
};