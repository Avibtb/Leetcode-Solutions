class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int reverse = 0,copy = x;
        while(copy!=0){
            reverse=(reverse*10)+(copy%10);
            copy/=10;
        }
        return reverse==x;
        
    }
}