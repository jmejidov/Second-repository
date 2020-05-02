package methodsandlibraries;

public class CityArray {
    public static void sameOrder (){
        String[] cities = { "New York City","Seattle", "San Diego", "Boulder","Ann Arbor"};
        for (int i = 0 ; i < 5 ; i ++){
            System.out.println(cities[i] + ", ");
        }
    }
    public static void lessThanfour (){
        String[] array = { "abc", "defgh", "qwerty", "asd"};
        int counter=0;
        for (int i = 0 ; i < array.length ; i ++){
            if (array[i].length() < 4){
                counter ++ ;

            }

        }
        System.out.println("There are "+ counter + " elements in its length is less than 4");
    }

    public static void main(String[] args) {
        lessThanfour();
        sameOrder();

    }
}
