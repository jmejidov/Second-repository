package methodsandlibraries;

public class FirstMethod {
    public static void randomNum (){
        for (int i = 0 ; i<6 ; i++){
            System.out.print((int)(Math.random()*10));

        }
    }

    public static void main(String[] args) {
        System.out.println(stringMethod());


    }
    public static String stringMethod (){
        String password  = "";
        for (int i = 0 ; i <6 ; i++ ){
            password += (((int)(Math.random()*10))+" ");
        }
        return password;

    }
}
