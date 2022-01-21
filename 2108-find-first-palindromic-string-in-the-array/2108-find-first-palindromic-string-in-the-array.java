class Solution {
    public String firstPalindrome(String[] words) {
        outer:
        for (String w : words) {
            for (int i = 0, j = w.length() - 1; i < j; ++i, --j) {
                if (w.charAt(i) != w.charAt(j)) {
                    continue outer;
                }
            }
            return w;
        }
        return "";
    }
}