class Solution {
    public boolean containsDuplicate(int[] nums) {
        final Set<Integer> arr = new HashSet<Integer>();
        for(int i : nums){
            if(arr.contains(i)){
                return true;
            }
            arr.add(i);
        }
        return false;
        
    }
}