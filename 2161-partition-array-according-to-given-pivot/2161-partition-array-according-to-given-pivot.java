class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int res[] = new int[nums.length];
        int k = 0, tencounter = 0;
        for(int num : nums){
            if(num < pivot)    res[k++] = num;
            if(num == pivot)    tencounter++;
        }
        for(int i=0; i<tencounter; i++){
            res[k++] = pivot;
        }
        for(int num : nums){
            if(num > pivot)     res[k++] = num;
        }
        return res;
        
    }
}