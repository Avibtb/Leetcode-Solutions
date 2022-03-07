class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l= nums.length;
        int[] pArray= new int[l/2];
        int[] nArray= new int[l/2];
        int i=0,j=0,k=0,m=0,n=0,p=0;
       
        while(i<l){
            if(nums[i]>0){
            pArray[k]=nums[i];
            k++;
            i++;
        }
            else{
                nArray[j]=nums[i];
                j++;
                i++;
            }
        }
        
        while(m<l){
            nums[m]=pArray[n];
            nums[m+1]=nArray[p];
            n++;
            p++;
            m++;
            m++;
        }
        
        return nums;
        
    }
}