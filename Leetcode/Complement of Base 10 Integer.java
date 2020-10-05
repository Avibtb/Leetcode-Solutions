class Solution {
    public int bitwiseComplement(int N) {
         if(N==0)
            return 1;
        int count = 0;
        int oldnum=  N;
        while(N > 0){
            N >>=1;
            count++;
        }
        int num =0;
        while(count>0){
            num = num <<1;
            num = num|1;
             count--;
        }
        return num ^ oldnum;
    
        
    }
}