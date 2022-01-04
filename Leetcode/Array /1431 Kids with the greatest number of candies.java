class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for(int i = 0;i < candies.length;i++){
            max = Math.max(candies[i],max);
        }
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            ans.add(candies[i] + extraCandies >= max);
        }
        return ans;
    }
}