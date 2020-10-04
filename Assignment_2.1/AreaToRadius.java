import java.util.Scanner;

class AreaToRadius {

    public static void main (String[] args) {
        Scanner i = new Scanner(System.in);
        double r = 0;
        double area = 0;

        System.out.println("Area To Radius");
        System.out.print("Please Enter Circle's Area: ");
        area = i.nextDouble();

        r = Math.sqrt (area / Math.PI);
        System.out.println("The circle has a radius of " + r + " ");
    }
}