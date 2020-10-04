import java.util.Scanner;

class MortgageCalculator {

    public static void main (String[] args) {
         Scanner i = new Scanner(System.in);
        double P = 0;
        double r = 0;
        double n = 0;
        double j = 0;
    System.out.println("Mortgage Calculator");
    System.out.print("Enter the principle：");
    P = i.nextDouble();    
    System.out.print("Enter the rate：");
    r = i.nextDouble(); 
    System.out.print("Enter the amouunt of years："); 
    n = i.nextDouble(); 
    
    j = P * Math.pow(1+r,n); //couldn't figure this out
        System.out.println("This investment will be worth $" + j + " after " + n + " years.");
}
}