class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int minn = INT_MAX,maxx = 0;
        for( int i :  prices){
            minn = min(i,minn);
            maxx = max(maxx,i-minn);
        }
        return maxx;
        
    }
};