class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        int maxLen = 0;
        String ans = null;
        boolean[][] dp = new boolean[len][len];
        for(int i = len-1; i>=0; i--){
            //each character itself is a palindrome
            dp[i][i] = true;
            for(int j = i; j<len; j++){
                boolean same = s.charAt(i)==s.charAt(j);
                if(same){
                    if(j-i+1>2){
                        //we need to have at least three characters
                        dp[i][j] = dp[i+1][j-1];
                    }else{
                        dp[i][j] = true;
                    }
                }
                if(dp[i][j]){
                    if(j-i+1>maxLen){
                        maxLen = j-i+1;
                        ans = s.substring(i,j+1);
                    }
                }
            }
        }

        return ans;
        
    }
}