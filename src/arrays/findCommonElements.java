package arrays;

public class findCommonElements {
    public static void main(String[] args) {
        int [] arrayOne = {2,5,7,9,45,65,17};
        int [] arrayTwo = {5,7,65,65,18,19} ;
        commonElements(arrayOne,arrayTwo);
    }
    public static void commonElements (int[] a , int [] b){
        int counter ;

        for (int i = 0 ; i < a.length; i++) {
            for (int j = 0 ; j < b.length ; j++){
                if (a[i]==b[j]){
                    System.out.println(a[i]);

                }
            }
        }
    }
}
