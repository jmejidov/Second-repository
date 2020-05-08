package arrays;

public class RandomIntAndString {

    public static void main(String[] args) {

        String [] arrayString = new String[10] ;
        for (int i = 0 ; i < arrayString.length ; i++){
            arrayString [i] = randomString();

        }
        for (String word : arrayString) {
            System.out.println(word);
        }

        /*
        int [] arrayNumbers = new int [10] ;
        for (int i = 0 ; i < arrayNumbers.length ; i++){
            arrayNumbers[i] = (int)(Math.random()*1000);

        }
        for (int number : arrayNumbers){
            System.out.println(number);
        }*/
    }
    static String randomString (){

        String word = "";

        int stringLength = (int)(Math.random()*5+1); // creates random length of the word inside the array
        for (int i = 0 ; i <stringLength ; i++){
            word += (char)((int) (Math.random()*26+97) ); //creates random chars and concatenate into the word
        }
        return word ;


    }
}
