class Solution {
public:
    int maxProfit(vector<int>& p) {
        int n = p.size();
        if(n == 0)
            return 0;
        if(n == 1)
            return 0;
        int profit = p[0] >= p[1] ? 0 :p[1] - p[0];
        int minn = min(p[0], p[1]);
        for(int i = 2;i<n;i++)
        {
            minn = min(minn, p[i]);
            profit = max(profit, p[i] - minn);
        }
        return profit;
    }
};