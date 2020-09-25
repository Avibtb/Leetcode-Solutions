class Solution {
    public String largestNumber(int[] nums) {
        String[] sArr = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            sArr[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(sArr,new Comparator<String>(){
            public int compare(String a,String b){
                String s1 = a + b;
                String s2 = b + a;
                return s2.compareTo(s1);
            }
        });
        if(sArr[0].equals("0")){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(String s : sArr){
            sb.append(s);
        }
         
        return sb.toString();
    }
}