class Solution {
    public int expressiveWords(String S, String[] words) {
        int res = 0;
        for (String word : words) {
            if (check(S, word)) res++;
        }
        return res;
    }
    
    public boolean check(String S, String word) {
        int i = 0, j = 0, m = S.length(), n = word.length();
        while (i < m && j < n) {
            if (S.charAt(i) != word.charAt(j)) return false;
            else {
                if (i == m - 1 && j == n - 1) return true;
                int preS = i, preWord = j;
                while (i < m && S.charAt(i) == S.charAt(preS)) {
                    i++;
                }
                while (j < n && word.charAt(j) == word.charAt(preWord)) {
                    j++;
                }
                int countS = i - preS, countW = j - preWord;
                if (countW > countS) return false;
                if (countS == 2 && countW == 1) return false;
                
            }
        }
        return i == m && j == n;
    }
}