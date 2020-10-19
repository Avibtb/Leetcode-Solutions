class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int res = Math.min(flip(A, B, A[0]), flip(A, B, B[0]));
        return res == Integer.MAX_VALUE ? -1 : res;
    }
    
    private int flip(int[] A, int[] B, int target){
        int ASwaps = 0, BSwaps = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] != target && B[i] != target) return Integer.MAX_VALUE;
            if(A[i] != target) BSwaps++;
            if(B[i] != target) ASwaps++;
        }
        return Math.min(ASwaps, BSwaps);
    }
}