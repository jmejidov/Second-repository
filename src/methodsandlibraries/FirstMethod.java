package methodsandlibraries;

public class FirstMethod {
    public static void randomNum (){
        for (int i = 0 ; i<6 ; i++){
            System.out.print((int)(Math.random()*10));

        }
    }

    public static void main(String[] args) {
        randomNum();

    }
}
