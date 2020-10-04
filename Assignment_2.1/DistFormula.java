import java.util.Scanner;

class DistFormula {

    public static void main (String[] args) {
        Scanner i = new Scanner(System.in);
        double x,x1,y,y1=0;
        double dist = 0;
    System.out.println("Distance Calculator");
    System.out.println("Please enter the first x coordinate");
    x = i.nextDouble();
    System.out.println("Please enter the first y coordinate");
    y = i.nextDouble();
    System.out.println("Please enter the second x coordinate");
    x1 = i.nextDouble();
    System.out.println("Please enter the second y coordinate");
    y1 = i.nextDouble();
    dist = Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
    System.out.println("The distance is " + dist);
}
}