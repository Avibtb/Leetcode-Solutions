class Solution {
    public int romanToInt(String s) {
        int result =0;
        int pVal=0;
        
        Map<Character, Integer> values = new HashMap<>();
        values.put('I',1);
        values.put('V',5);
        values.put('X',10);
        values.put('L',50);
        values.put('C',100);
        values.put('D',500);
        values.put('M',1000);
        
        for(int i=0; i<s.length();i++)
        {
            int val = values.get(s.charAt(i));
            result += val;
            
            if(pVal<val)
                result -= 2*pVal;
            pVal=val;
        }
        
        return result;
        
    }
}