class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int[] arr = new int[101];
        for(int n : nums)
            arr[n]++;
        for(int n : arr)
        {
            count += n*(n-1)/2;
        }
        return count ;

    }
}