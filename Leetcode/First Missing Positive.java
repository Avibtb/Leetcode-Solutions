class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean[] count = new boolean[nums.length+1];
        int i;
        for (i=0; i< nums.length; i++)
        {
            if (nums[i] > 0 &&  nums[i] < count.length)
            {
                count[nums[i]] = true;
            }
        }
        for (i=1; i  < count.length; i++)
        {
            if (!count[i])
                break;
        }
        return i;
        
    }
}