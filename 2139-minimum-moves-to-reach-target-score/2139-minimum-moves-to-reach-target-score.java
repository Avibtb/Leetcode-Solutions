class Solution {
    public int minMoves(int target, int maxDoubles) {
        int ans = 0;
        while(target >0 && maxDoubles >0)
        {
           if(target%2 == 0)
            {
             target = target/2;
             maxDoubles--;
             }
            
            else
            {
                target = target-1;
             }
            ans++;
        }
        if(target != 1) ans+=target-1;
        return ans;
    }
}