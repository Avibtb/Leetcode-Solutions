class Solution {
public:
    bool wordPattern(string pattern, string str) {
        map<char,string>mp;
        map<string,int>mp2;
        vector<string>v;
        string temp="";
        for(int i=0;i<str.size();i++)
        { 
            if(str[i]!=' ')
                temp+=str[i];
            else
            {
                v.push_back(temp);
                temp="";
            }
        }
        v.push_back(temp);
        if(v.size()!=pattern.size())
            return false;
        for(int i=0;i<pattern.size();i++)
        {
            if(mp.find(pattern[i])==mp.end())
            {
                if(mp2.find(v[i])!=mp2.end())
                    return false;
                mp[pattern[i]]=v[i];
                mp2[v[i]]++;
                
            }
            else
            {
                if(mp[pattern[i]]!=v[i])
                    return false;
            }
        }
        return true;
    }
};