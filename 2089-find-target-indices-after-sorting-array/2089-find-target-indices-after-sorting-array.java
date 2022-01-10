class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count = 0 , less_count = 0;
        for(int n : nums){
            if (n == target) count++;
            if( n < target) less_count++;
        }
        List<Integer> ans = new ArrayList<>(); 
        for(int i = 0; i< count;i++){
            ans.add(less_count++);
        }
        return ans;
    }
}