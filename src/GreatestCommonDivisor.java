public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){

        int minVal= 0;
        int maxVal = 0;
        if ( first < 10 || second < 10){
            return -1;
        }else{

            if (first >= second){
                maxVal= first;
                minVal= second;
            }else{
                maxVal= second;
                minVal=first;
            }

            int commonDivisor=0;

            for(int i = 1; i<=maxVal; i++){


                if((maxVal % i) ==0){
                    System.out.println(i);
//                    System.out.println(maxVal);

                    if((minVal%i ==0)){
//                        System.out.println(minVal);
                        System.out.println(i);
                        commonDivisor = i;
                        System.out.println(commonDivisor);
                    }
                }
            }

            return commonDivisor;
        }


    }

}
