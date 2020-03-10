// Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        // If j is the number of jumps when both kangaroo's are at same position
        // we can form the below equation
        // Position of Kangaroo 1 in jumps j =  Position of Kangaroo 2 in jumps j
        // => x1 + (v1 * j) = x2 + (v2 * j)
        // => (v1 * j) - (v2 * j) = x2 - x1
        // => j(v1-v2) = x2-x1
        // => j = (x2-x1)/(v1-v2)
        // If J is a whole number after this calculation, 
        // the meet is possible. Otherwise no.

        if(v1==v2){
            // Since both the Kangaroos start at different positions (at least 1 diff), v1 == v2 will never result in meet
            return "NO";
        }

        double j = ((float)(x2-x1)/(float)(v1-v2));
        System.out.println(j);

        if((j<0) || (Math.ceil(j) != Math.floor(j)) ){
            return "NO";
        }
        else{
            return "YES";
        }

    }
