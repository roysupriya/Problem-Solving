    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
         String timeArray[] = s.split(":");
         String militaryFormat = new String();

         if(timeArray[2].indexOf("PM")!= -1){
             int hhIn12HourFormat = Integer.parseInt(timeArray[0]);
             if( hhIn12HourFormat == 12){
                 timeArray[0] = String.format("%02d",hhIn12HourFormat % 24);
             }
             else {
                  timeArray[0] = String.format("%02d",(hhIn12HourFormat+12) % 24);
             }             
         }
         else{
             timeArray[0] = String.format("%02d",((Integer.parseInt(timeArray[0]))%12)); 
         }

        militaryFormat = String.join(":", timeArray);

        militaryFormat = militaryFormat.substring(0,militaryFormat.length()-2);

        return militaryFormat;
    }
