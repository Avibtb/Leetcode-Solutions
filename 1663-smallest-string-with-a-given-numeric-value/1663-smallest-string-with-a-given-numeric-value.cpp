class Solution {
public:
    string getSmallestString(int n, int k) {
         int x = k - n;
        string ans = string(x / 25, 'z');
        x %= 25;
        if (x) 
            ans = (char)('a' + x) + ans;
        return string(n - ans.length(), 'a') + ans;
        
    }
};