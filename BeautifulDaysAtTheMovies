 // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        //Algorithm:
        // 1. For each number between i and j (inclusive of i and j day) do below:
        //   a. Reverse the number by doing below until the original number becomes 0
        //      p. Find remainder when dividing original number by 10 
        //      q. Multiple the remainder by 10 
        //      r. Add it to the reverse number formed so far (initially reverse number will be 0)
        //      s. Update the original number as the number divided by 10
        //      t. Repeat the steps until original number becomes 0
        //  b. Check if the remainder of dividing |(number - reverse number)| by k is 0
        //      p. if remainder is 0 -> count increase of beatiful day
        
        int beautifulDaysCount = 0;

        for(int n = i; n <=j; n++){
            int r, num;
            num = n;
            r = 0;

            //Find reverse r
            while(num>0){
                int remainder = num%10;
                num /= 10;
                r = (r*10) + remainder;
            }           
            
            //Find beautiful day
            int day = Math.abs((n - r)%k);
            if(day == 0){
                beautifulDaysCount++;
            }
        }
        return beautifulDaysCount;
    }
