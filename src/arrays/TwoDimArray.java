package arrays;

public class TwoDimArray {
    public static void main(String[] args) {

        int [] [] arr = new int [3][3];
        int counter = 1;
        for (int i = 0 ; i<arr.length ; i++){

            for (int j = 0 ; j < arr[i].length ; j++ ){

                arr[i][j] += counter ;
                counter ++;

            }
        }
        //to print all elements of the array
        for (int i = 0 ; i < arr.length ; i++){

            for (int number: arr[i]){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
