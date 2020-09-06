class Solution {
public:
    int move(vector<vector<int>>A, vector<vector<int>>B) {
        int n = A.size(), ans = -1;
        for(int x = 0; x < n; ++x)
            for(int y = 0; y < n; ++y) {
                int curr = 0;
                for(int i = x; i < n; ++i)
                    for(int j = y; j < n; ++j)
                        if(B[i][j] == 1 and A[i-x][j-y] == 1)
                            curr++;
                ans = max(ans, curr);
            }
        return ans;
    }
    int largestOverlap(vector<vector<int>>& A, vector<vector<int>>& B) {
        return max(move(A,B), move(B,A));
    }
};