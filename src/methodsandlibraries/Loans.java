package methodsandlibraries;

public class Loans {
    public static void main(String[] args) {
        //prints integer from the method calculateCarLoan()
        System.out.println(calculateCarLoan(300,12));
    }
    public static int calculateCarLoan (int monthly, int monthnum ){
       int totalAmount = 35000 ;
       int restPayment = totalAmount - monthly*monthnum;
       return restPayment;
    }
}
