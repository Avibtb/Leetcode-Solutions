class Solution {
    public int[] productExceptSelf(int[] nums) {
        //int len = nums.length;
        // int ans[] = new int[len];
        
        // Brute force
        // int ans[] = new int[len];
        // for(int i = 0;i<len;i++){
        //     int pro = 1;
        //     for(int j =0;j<len;j++){
        //         if(i==j)continue;
        //         pro *= nums[j];
        //     }
        //     ans[i] = pro;
        // }
        // return ans;
        
//         int pro = 1;
//         for(int i =0;i<len;i++){
//             pro *= nums[i];
//         }
//         for(int i = 0;i<len;i++){
//             ans[i] = pro / nums[i];
//         }
//         return ans;
        
           int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
        
        
        
        
        
        
    }
}