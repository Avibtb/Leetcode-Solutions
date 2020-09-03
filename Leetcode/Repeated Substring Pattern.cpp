class Solution {
public:
    bool repeatedSubstringPattern(string s) {
         string str=s+s;
        return str.substr(1,str.size()-2).find(s)!=string::npos;
        
    }
};