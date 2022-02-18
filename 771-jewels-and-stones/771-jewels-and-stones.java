class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set j = new HashSet();
        for(char i : jewels.toCharArray()){
            j.add(i);
        }
        for(char i: stones.toCharArray() ){
            if(j.contains(i))
                count++;
        }
        return count;
        
    }
}