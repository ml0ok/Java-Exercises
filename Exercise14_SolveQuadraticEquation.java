import java.util.Scanner;

public class Exercise14_SolveQuadraticEquation {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = s.nextDouble();

        System.out.print("Input b: ");
        double b = s.nextDouble();

        System.out.print("Input c: ");
        double c = s.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {

            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("The roots are " + r1 + " and " + r2);

        } else if (d == 0) {

            double r = -b / (2 * a);

            System.out.println("The root is " + r);

        } else {

            System.out.println("The equation has no real roots");

        }
    }
}
