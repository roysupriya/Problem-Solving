class Solution {
    public int romanToInt(String s) {
        // Approach 2: Execution time : 4ms, Memory usage : 41.9MB
        // 1. Traverse each character in the string
        // 2. For each char, compare with next char
        // 3. For each specific substraction pair, subtract 2 * value of smaller char from total sum
        // 4. In a second traversal, add value to sum corresponding to each char without caring about next char
        //
        // Specific substraction pair:
        //  IV = 5 - 1 = 4        { Logic to calculate as above => -2*1 + 1 + 5  = 4}
        //  IX = 10 - 1 = 9       { Logic to calculate as above => -2*1 + 1 + 10 = 9}
        //  XL = 50 - 10 = 40     { Logic to calculate as above => -2*10 + 10 + 50 = 40}
        //  XC = 100 - 10 = 90    { Logic to calculate as above => -2*10 + 10 + 100 = 90}
        //  CD = 500 - 100 = 400  { Logic to calculate as above =? -2*100 + 100 + 500 = 400}
        //  CM = 1000 - 100 = 900 { Logic to calculate as above => -2*100 + 100 + 1000 = 900}
        
        int sum = 0;
        
        for(int i=0; i<(s.length()-1); i++){
            if((s.charAt(i) == 'I') && (s.charAt(i+1)=='V')) {sum-=2;}
            if((s.charAt(i) == 'I') && (s.charAt(i+1)=='X')) {sum-=2; }
            if((s.charAt(i) == 'X') && (s.charAt(i+1)=='L')) {sum-=20;}
            if((s.charAt(i) == 'X') && (s.charAt(i+1)=='C')) {sum-=20;}
            if((s.charAt(i) == 'C') && (s.charAt(i+1)=='D')) {sum-=200;}
            if((s.charAt(i) == 'C') && (s.charAt(i+1)=='M')) {sum-=200;}          
        }
        
        for (int i=0; i<s.length(); i++){
             if(s.charAt(i) == 'I'){
                sum += 1;
            }
            else if(s.charAt(i) == 'V'){
                sum += 5;
            }
            else if(s.charAt(i) == 'X'){
                sum += 10;
            }
            else if(s.charAt(i) == 'L'){
                sum += 50;
            }
            else if(s.charAt(i) == 'C'){
                sum += 100;
            }
            else if(s.charAt(i) == 'D'){
                sum += 500;
            }
            else if(s.charAt(i) == 'M'){
                sum += 1000;
            }            
        }
        
        return sum;       
       
    }
}
