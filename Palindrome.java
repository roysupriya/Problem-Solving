class Solution {
    public boolean isPalindrome(int x) {
        // Approach 1:
        // 1. Convert the int to string. 
        // 2. Compare first character with last character till you reach the center comparison
        // 3. If you reached mid point without hitting a mismatch -> palindrom. Else not palindrome
        
        
        // Approach 2:
        // 1. Find reverse of the int
        // 2. Check if both are equal
        
        //// Approach 1 below : Runtime = 8ms Memory usage = 40.9MB
        // String numberAsString;
        // boolean palindrome = true;        
        // numberAsString = Integer.toString(x);                
        // for(int i=0; i<=(numberAsString.length()/2) ; i++){
        //     if(numberAsString.charAt(i)!=numberAsString.charAt(numberAsString.length()-i-1)){
        //         palindrome = false;
        //         break;
        //     }
        // }
        // return palindrome;
        
        // Appraoch 2 below: Runtime = 6ms. Memory Usage = 40.6MB
        int reverse=0;
        for(int i=x; i!=0 ; i=i/10){
            reverse = reverse*10 + i%10;
        }
        if(Math.abs(reverse) == x){
            return true;
        }
        else{
            return false;
        }
            
    }    
}
