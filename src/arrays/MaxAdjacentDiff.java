package arrays;

public class MaxAdjacentDiff {

    public static void main(String[] args) {

        int [] arr = {4,6,8,12,15,100,15,3,22,-22};

        printMaxDiff(arr);

    }



    static int returnDiff (int [] arr ){

        int maxdiff = 0;


        for (int i = 0 ; i < arr.length-1 ; i++ ){

            if ( (arr[i+1]- arr[i]) > maxdiff ) {

                maxdiff = arr[i + 1] - arr[i];
            }
            else if ((arr[i] - arr[i+1]) > maxdiff ){

                maxdiff = arr[i] - arr[i+1] ;

            }


        }
        return maxdiff;
    }
    static void printMaxDiff (int [] arr ) {
        int diffs [] = new int [arr.length] ;
        for (int i = 1 ; i < arr.length ; i ++ ){
            diffs [i] = Math.abs(arr[i] - arr[i-1]);
        }
        //Now find the max value of 1D array
        int max = diffs [0];
        int index = 0;
        for (int i = 0 ; i < diffs.length ; i++ ){
            if (diffs[i]> max ){
                max = diffs[i];
                index = i;
            }
        }
        System.out.println("Max difference is "+max+" at the index "+index );
    }
}
