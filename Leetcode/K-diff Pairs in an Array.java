class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0)
            return 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (!map.containsKey(nums[i])){
                if (map.containsKey(nums[i] - k))
                    count++;
                if (map.containsKey(nums[i] + k))
                    count++;
            }
            if (k == 0){
                if (map.containsKey(nums[i]))
                    if (map.get(nums[i]) == 1)
                        count++;
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return count;
    }
}