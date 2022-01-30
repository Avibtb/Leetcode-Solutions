class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> str = new HashSet<>();
        while(j<s.length()){
            if(!str.contains(s.charAt(j))){
                str.add(s.charAt(j++));
                max = Math.max(max, str.size());
            }
            else {
            str.remove(s.charAt(i++));
        }
        }
        return max;
        
        
    }
}