package methodsandlibraries;

public class PasswordWithLetters {
    public static String passwordCreator (){
        String password = "";
        int a;
        for (int i = 0 ; i < 6 ; i++){
            a = 97 + (int) (Math.random()*26);
            password+= (char) a + " " ;
        }
        return password ;

    }

    public static void main(String[] args) {
        System.out.println(passwordCreator());
    }
}
