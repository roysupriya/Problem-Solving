class Solution {
    public int romanToInt(String s) {
        // Approach 1: // Execution time 6ms, Memory usage 41.4 MB
        // 1. Traverse each character in the string
        // 2. For each char, compare with next char
        // 3. If curr char is lesser in value in roman than next char
        //    a. Value of combined two characters = Next - Curr
        //    b. Else value of combined two characters = Next + Curr
        
        Map<String, Integer> romanNumberMap = new HashMap<>();
        romanNumberMap.put("I",1);
        romanNumberMap.put("V",5);
        romanNumberMap.put("X",10);
        romanNumberMap.put("L",50);
        romanNumberMap.put("C",100);
        romanNumberMap.put("D",500);
        romanNumberMap.put("M",1000);
        
        String curr, next;
        int integerEquivalent = 0;
        
        next = null;
        for(int i=0; i<s.length(); i++){
            curr = Character.toString(s.charAt(i));
            
            if((i+1)<s.length()){
                next = Character.toString(s.charAt(i + 1)); 
                
                if(romanNumberMap.get(curr)<romanNumberMap.get(next)){
                    integerEquivalent += romanNumberMap.get(next) - romanNumberMap.get(curr);
                    i++;
                } 
                else {
                    integerEquivalent += romanNumberMap.get(curr);
                }
            }
            else{
                integerEquivalent += romanNumberMap.get(curr);              
            }
        }
        return integerEquivalent;
    }
}
