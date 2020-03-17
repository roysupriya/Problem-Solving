 public static int getTotalX(List<Integer> a, List<Integer> b) {
		//// Approach

		// 1. Find factors in b array (excluding value 1)
		// 2. Count for all the factors found in b array, how many are a multiples of items in a array
		// 3. If array a has value 1, increase the count as 1 is always a multiple and a factor fo any given number

        List<Integer> factorsOfB = new ArrayList<>();
        int minB=Integer.MAX_VALUE, count=0;

        // 1. Find factors in b array 
        //      a. Find min value in array
        //      b. From min to 2, find factors, while decrementing the value 
        // Note: (avoid using sort to find min, as it adds on time complexity)
        
        // Step 1.a
        for(int index=0; index<b.size(); index++){
            if(minB>b.get(index)){
                minB=b.get(index);
            }
        }
        // Step 1.b
        for(int factorSuspect = minB ; factorSuspect>1; factorSuspect-- ){
            boolean factorFlag = true;
            for(int index=0; index<b.size(); index++){
                if(b.get(index)%factorSuspect!=0){
                    factorFlag = false;
                    break;
                }
            }
            if(factorFlag){
                 factorsOfB.add(factorSuspect);
            }
        }  

        //2. Finding whether found HCF is a LCM in a array
        for (int factorIndex=0 ; factorIndex <factorsOfB.size(); factorIndex++){
            boolean flagMultiple=true;
            for(int index=0; index<a.size(); index++){
                if(factorsOfB.get(factorIndex)%a.get(index)!=0){
                    flagMultiple= false;
                    break;
                }
            }
            if(flagMultiple){
                count++;
            }
        }

        // Boundary condition check
        // If list a has value 1, we need to count that also as matched value.
        // 1 is always a multiple and hcf of any number
        if(a.indexOf(1)!=-1){
            count++;
        }
        return count;
    }

}