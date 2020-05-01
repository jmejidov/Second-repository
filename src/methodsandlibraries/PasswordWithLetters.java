package methodsandlibraries;

public class PasswordWithLetters {
    public static String passwordCreator (){
        String password = "";
        int a;
        for (int i = 0 ; i < 10 ; i++){
            a = 97 + (int) (Math.random()*26);
            password+= (char) a + " " ;
        }
        return password ;

    }
    public static void complexPass (int num ){
        for (int i = 0 ; i < num ; i ++){
            System.out.print(((char)(97+Math.random()*26))+" ");
        }
        for (int j = 0 ; j < num; j++ ){
            System.out.print((int)(Math.random()*10)+" ");
        }
    }

    public static void main(String[] args) {
        complexPass(3);
        System.out.println();
        System.out.println(passwordCreator());
    }
}
