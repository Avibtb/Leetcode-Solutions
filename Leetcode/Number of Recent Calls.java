class RecentCounter {
    
    ArrayList<Integer> array = new ArrayList<>();
    
    public RecentCounter() {  
        
    }
    
    public int ping(int t) {
        array.add(t);
        int requests_notpresent = 0;
        int range_start = t -3000;
        for(int i =0;i<array.size();i++){
            if(range_start > array.get(i)){
                requests_notpresent++;
            }
            else{
                break;
            }
        }
        return array.size()-requests_notpresent;
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */