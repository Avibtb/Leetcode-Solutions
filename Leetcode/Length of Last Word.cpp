class Solution {
public:
  int lengthOfLastWord(std::string s) {
        if (s.empty()) return 0;
        while(!s.empty() && s.back() == ' ') { s.pop_back(); }
        int size = s.size();
        int length = 0;
        for (int i = 0; i < size; i++){
            if (s[i] == ' ') length = 0;
            else length++;
        }
        return length;
    }
};