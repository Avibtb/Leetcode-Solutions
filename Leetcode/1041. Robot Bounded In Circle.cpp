class Solution {
public:
    bool isRobotBounded(string instructions) {
        unordered_map<char,string> dir{{'N',"WE"},{'S',"EW"},{'E',"NS"},{'W',"SN"}};
        unordered_map<char,pair<int,int>> moves{{'N',{1,0}},{'S',{-1,0}},{'E',{0,1}},{'W',{0,-1}}};
        int i=0,j=0;
        char facing = 'N';
        for(char c:instructions){
            if(c == 'L')
                facing = dir[facing][0];
            if(c == 'R')
                facing = dir[facing][1];
            if(c == 'G')
                i += moves[facing].first, j+= moves[facing].second;
        }
        return i == 0 && j == 0 || facing != 'N';
    }
};