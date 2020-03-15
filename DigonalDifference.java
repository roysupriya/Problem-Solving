 /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here

        int diagonalLeftRight, diagonalRightLeft, diagonalDiff;
        diagonalLeftRight = diagonalRightLeft = diagonalDiff = 0;

        for(int i=0 ; i<arr.size(); i++){
            for(int j=0; j<arr.size(); j++){  
                if(i==j){
                    diagonalLeftRight += arr.get(i).get(j);
                    System.out.println("diagonalLeftRight: " + diagonalLeftRight);
                }
                int indexSum = i+j;

                if(indexSum == (arr.get(i).size()-1)){
                    diagonalRightLeft += arr.get(i).get(j);
                    System.out.println("diagonalRightLeft: " + diagonalRightLeft); 
                }
            }
        }        
        diagonalDiff = diagonalLeftRight - diagonalRightLeft;        
        return Math.abs(diagonalDiff);
    }
