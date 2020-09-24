 class Solution {
   public:
   char findTheDifference(string s, string t) {
    
    char x = 0;
    
    for(auto ch : s)
    {
        x^=ch;
    }
    
    for(auto ch: t)
    {
        x^=ch;
    }
    
    return x;
    
}
 };