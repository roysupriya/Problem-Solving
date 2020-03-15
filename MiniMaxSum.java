
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        long sum;
        int min, max;
        sum = 0;
        min = Integer.MAX_VALUE;
        max = 0;

        for(int i=0; i<arr.length ; i++){
            sum += arr[i];

            if(min>arr[i]){
                min = arr[i];
            }

            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println((sum-max) + " " + (sum-min));
    }
