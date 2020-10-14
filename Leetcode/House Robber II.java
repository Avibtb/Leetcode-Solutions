class Solution {
    int[] nums;
    int[][] cache;
    
    public int rob(int[] nums) {
        this.nums = nums;
        this.cache = new int[2][nums.length+2];
        
        Arrays.fill(this.cache[0],-1);
        Arrays.fill(this.cache[1],-1);
        
        return robRec(0,0);
    }
    
    private int robRec(int index, int firstHouseRobbed) {
        
        if(cache[firstHouseRobbed][index]==-1) {
            if(index>=nums.length) { 
                cache[firstHouseRobbed][index] = 0;
            }
            else { 
                int way1 = 0;
                int way2 = 0; 
                if(index<nums.length-1 || firstHouseRobbed==0) {
                    way1 = nums[index]+robRec(index+2,index==0?1:firstHouseRobbed);
                }
                way2 = robRec(index+1,firstHouseRobbed);
                
                cache[firstHouseRobbed][index] = Math.max(way1,way2);
            }
        }
        return cache[firstHouseRobbed][index];
    }
        
}