class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // for(int i =0;i<m+n;i++){
        //     if(nums1[i] <= nums2[i]){
        //         nums1[i] = nums1[i];
        //     }
        //     else{
        //         nums1[i] = nums2[i];
        //     }
        // }
        
        int low = m-1, high = n-1, i = m+n-1;
        while(high>=0){
            if(low>=0 && nums1[low] > nums2[high]){
                nums1[i--] = nums1[low--];
            }
            else{
                nums1[i--] = nums2[high--];
            }
        }
        
        
    }
}