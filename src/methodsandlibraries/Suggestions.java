package methodsandlibraries;

public class Suggestions {
    public static void main(String[] args) {
        foodRandom();
    }
    public static void foodRandom (){
        int a = 1+ (int)(Math.random()*3) ;
        if (a == 1){
            System.out.println("Drink Soup");
        }
        else if (a == 2){
            System.out.println("Eat Hamburger");
        }
        else if (a == 3){
            System.out.println("Eat French Fries");
        }
        else {
            System.out.println("this shit aint working");
        }
    }
}
