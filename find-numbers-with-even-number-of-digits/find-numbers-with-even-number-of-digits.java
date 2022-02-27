class Solution {
    
    public int count(int n){
        int inc = 1;
        while( (n/=10)!=0){
            inc+=1;
        }
        return inc;
    }
    
    public int findNumbers(int[] nums) {
       int ans = 0;
        for(int i:nums){
            if(count(i) % 2 == 0){
                ans+=1;
            }
            
        }
        return ans;
        
    }
}