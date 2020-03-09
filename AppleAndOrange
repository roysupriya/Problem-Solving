    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int countApples, countOranges, orangePos,applePos;
        countApples = countOranges = orangePos = applePos = 0;

        for(int i=0 ; i<apples.length; i++){
            
            applePos = apples[i]+a;
            if(applePos>=s && applePos<=t){
                countApples++;
            }
        }
        
        System.out.println(countApples);
        
        for(int i=0 ; i<oranges.length; i++){
            
            orangePos = oranges[i]+b;
            if(orangePos<=t && orangePos>=s){
                countOranges++;
            }
        }

        System.out.println(countOranges);
    }
