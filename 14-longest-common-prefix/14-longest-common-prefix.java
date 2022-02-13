class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) return "";
        if (strs.length == 1) return strs[0];
        Arrays.sort(strs);
        int i = 0;
        int j = 0;
        String ans = "";
        String first = strs[0];
        String last = strs[strs.length - 1];
        while (i < first.length() && j < last.length()){
            if (first.charAt(i) != last.charAt(j)){
                return ans;
            } else {
                ans += first.charAt(i);
                i++;
                j++;
            }
        }
        return ans;
        
    }
}