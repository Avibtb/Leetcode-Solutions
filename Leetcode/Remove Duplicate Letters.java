
class Solution {
    public String removeDuplicateLetters(String text) {
        int[] cnt = new int[26];
        boolean[] added = new boolean[26];
        
        for(char c: text.toCharArray()) cnt[c - 'a']++;
        
        StringBuilder res = new StringBuilder();
        res.append('0');
        
        for(char c: text.toCharArray()) {
            cnt[c-'a']--;
            if(!added[c - 'a']) {
                char x = res.charAt(res.length() - 1); 
                while(x > c && cnt[x - 'a'] > 0) {
                    res.deleteCharAt(res.length() - 1);
                    added[x - 'a'] = false;
                    x = res.charAt(res.length() - 1);
                }
                res.append(c);
                added[c-'a'] = true;
            }
        }
        
        return res.substring(1).toString();
    }
}