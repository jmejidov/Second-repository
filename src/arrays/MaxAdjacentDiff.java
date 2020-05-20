package arrays;

public class MaxAdjacentDiff {

    public static void main(String[] args) {

        int [] arr = {4,6,8,12,15,17,15,3,22};

        System.out.println(returnDiff(arr));

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
}
