package arrays;

public class ArrayMerging {

    static void mergeArrays (int [] a , int [] b ){
        int lenMergedArray = a.length + b.length;
        int [] mergedArray = new int[lenMergedArray];
        //adding values of the first array (array a)
        for (int i = 0 ; i < a.length ; i ++){
            mergedArray[i]= a[i];
        }
        //adding elements of the second array (array b)
        int index = 0;
        for (int i = a.length ; i <mergedArray.length ; i++){
            mergedArray[i]=b[index];
            index ++;
        }
        //to print elements
        for (int i = 0 ; i < mergedArray.length ; i++){
            System.out.println(mergedArray[i]);
        }
    }
}
