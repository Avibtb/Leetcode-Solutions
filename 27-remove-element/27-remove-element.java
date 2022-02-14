class Solution {
    public int removeElement(int[] nums, int val) {
    int k = nums.length - 1;
	while(k >=0 && nums[k] == val) {
		k--;
	}

	for (int i = k; i >= 0; i--) {
		if (nums[i] == val) {
			nums[i] = nums[k];
			k--;
		}
	}

	return k+1;
        
    }
}