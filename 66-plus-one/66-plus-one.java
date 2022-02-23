class Solution {
    public int[] plusOne(int[] digits) {
    
        if(digits == null){
            throw new IllegalArgumentException("Input array is null");
        }
        int len = digits.length;
        if(len == 0){
            return new int[] { 1 };
        }
        for(int i = len - 1; i>=0;i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[len+1];
        digits[0] = 1;
        return digits;
        
    }
}