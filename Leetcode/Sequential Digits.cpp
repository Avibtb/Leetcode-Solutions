class Solution {
public:
    vector<int> sequentialDigits(int low, int high) {
        vector<int> res;
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j+i-1 <= 9; j++){
                int x = 0;
                for(int k = 0; k <= i-1; k++){
                    x = 10 * x + j + k;
                }
                if(x >= low && x <= high)
                    res.push_back(x);
            }
        }
        return res;
    }
};