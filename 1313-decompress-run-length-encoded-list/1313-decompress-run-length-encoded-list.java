class Solution {
    public int[] decompressRLElist(int[] nums) {
        //ArrayList<Integer> arr = new ArrayList<>();
        int numsSize = 0;
        for(int i = 0; i<nums.length;i+=2){
            numsSize += nums[i];
        }
        int ans[] = new int[numsSize];
        int startIndex = 0;
        for(int i =0; i<nums.length;i+=2){
            Arrays.fill(ans,startIndex, startIndex+nums[i],nums[i+1]);
            startIndex += nums[i];
        }
        return ans;
        
    }
}