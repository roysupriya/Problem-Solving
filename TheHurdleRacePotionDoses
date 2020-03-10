    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
        //Algorithm:
        // 1. Find the max hurdle height in the aray
        // 2. See the difference between maximum hurdle height and nature jump height
        // 3. If natural jump height >= max hurdle height => No doses requied
        // 4. If natural jump height < max hurdle height => subtract the two numbers

        int max = Integer.MIN_VALUE;

        for(int i=0 ; i< height.length ; i++){
            if(max<height[i]){
                max=height[i];
            }
        }
        if(max>k){
            return max-k;
        }
        else{
            return 0;
        }
    }
