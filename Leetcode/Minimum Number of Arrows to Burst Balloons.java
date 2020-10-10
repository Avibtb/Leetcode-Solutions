class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;
        Arrays.sort(points, Comparator.comparingInt(a -> a[1])); 

        int arrowsFired = 1;
        int arrowFiredValue = points[0][1]; 
        for (int i = 1; i < points.length; i++) {
            
            int left = points[i][0];
            int right = points[i][1];
            
           
            if (!(arrowFiredValue >= left && arrowFiredValue <= right)) {
                
                arrowsFired++; 
                arrowFiredValue = points[i][1];  
                
            }
        }

        return arrowsFired;
        
    }
}