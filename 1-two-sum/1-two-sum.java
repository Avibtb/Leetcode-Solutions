class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create Hashmap that will store integer type key and value.
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        
         /* Now we will iterate through whole array and check for our condition and if condition               satisfied then we will create an array name res that will store the index of values.               Then we will return that array. If condition not satisfied we will add that value and             its index number in hashmap as key and value. */
        for (int i=0; i<nums.length; i++){
        if (hash.containsKey(target-nums[i])){
            int[] ans = {hash.get(target-nums[i]),i};
            return ans;
        }
        hash.put(nums[i],i);
    }
    return null;
        
    }
}