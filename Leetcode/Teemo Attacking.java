class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int pTime = 0;
    if(timeSeries.length == 0)
        return 0;
    
    for(int i = 1; i < timeSeries.length; i++) {
        pTime += Math.min(duration, timeSeries[i] - timeSeries[i-1]);
        
    }
    pTime += duration;
    return pTime;       
    }
}