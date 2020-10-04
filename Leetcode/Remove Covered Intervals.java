class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        List<int[]> list=Stream.of(intervals).sorted(
            (a,b)->((a[1]-a[0])-(b[1]-b[0]))).collect(Collectors.toCollection(ArrayList::new));
        int i=list.size()-1;
        while(i>0){
            final int[] curr=list.get(i);
            
            if(list.subList(0,i).removeIf(e->e[0]>=curr[0]&&e[1]<=curr[1]))
               i=list.size()-1;
            else
               i--; 
        }
        return list.size();
    }
}