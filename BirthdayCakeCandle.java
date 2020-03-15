// Complete the birthdayCakeCandles function below.
    // Method using HashMap
    static int birthdayCakeCandles(int[] ar) {

        Map<Integer,Integer> candleHeightToCount = new HashMap<>();
        int tallestCandle = Integer.MIN_VALUE;

        for(int i=0; i<ar.length; i++){
            if(tallestCandle<ar[i]){
                candleHeightToCount.clear();
                candleHeightToCount.put(ar[i],1);
                tallestCandle = ar[i];
            }
            else if(tallestCandle == ar[i]){
                candleHeightToCount.replace(ar[i],candleHeightToCount.get(ar[i])+1);
            }            
        }
        return candleHeightToCount.get(tallestCandle);
    }
