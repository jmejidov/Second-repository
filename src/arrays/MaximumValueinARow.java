package arrays;
import java.util.Arrays;

public class MaximumValueinARow {
    public static void main(String[] args) {
        int[][] newArr = {{1,4},{3,4}};
        int [][] returnArr = switchRowsArr(newArr);

        for (int [] row : returnArr ){

            for (int num : row ){

                System.out.print(num);
            }
            System.out.println();
        }

        /*
        int [][] myArray = {{1,2,3,9},{4,5,6,7},{7,8,9,7}};

        int [] [] newArr = {{1,2,3,9,12},{4,5,6,7,11},{10,7,8,9,7}};

        int arr [] = maxRowReturn(newArr);
        String arrStr = Arrays.toString(arr);
        System.out.println(arrStr);

        for (int num : arr ){
            System.out.print(num);
        }*/


    }
    static int [] maxRowReturn (int [] [] array ){


        int maxes [] = new int [array.length];

        int index = 0;

        for (int arr [] : array){

            int maxVal = array [index] [0] ;

            for (int i = 0 ; i< arr.length ; i++ ){

                if (arr[i]<maxVal ){

                    maxVal = arr[i];
                }
            }
            maxes[index] = maxVal ;
            index ++;

        }
        return maxes;

    }

    static int [][] switchRowsArr (int [] [] arr ){

        int [][]  arrReturn = new int [2][2];
        int index = 0;
        for (int [] row : arr ){

            for (int i = 0 ; i < row.length ; i++ ){

                arrReturn[index][i] = arr [i][index] ;

            }
            index++;
        }
        return arrReturn;

    }

    static void maxValueInaRow (int [] [] arr ){
        int max = arr [0][0] ;
        for(int i = 0 ; i < arr.length ; i++ ){

            max = 0;

            for (int j = 0 ; j < arr[i].length ; j ++ ){

                if (arr[i][j] > max ){

                    max = arr[i][j] ;
                }
            } System.out.print("\t"+max);
        }
    }
}

