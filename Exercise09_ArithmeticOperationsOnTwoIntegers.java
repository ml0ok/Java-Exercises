import java.util.Scanner;

public class Exercise09_ArithmeticOperationsOnTwoIntegers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Input 1st integer: ");
        int x = s.nextInt();

        System.out.print("Input 2nd integer: ");
        int y = s.nextInt();

        System.out.println("Sum of two integers: " + (x + y));
        System.out.println("Difference of two integers: " + (x - y));
        System.out.println("Product of two integers: " + (x * y));
        System.out.println("Average of two integers: " + ((x + y) / 2.0));
        System.out.println("Distance of two integers: " + Math.abs(x - y));
        System.out.println("Max integer: " + Math.max(x, y));
        System.out.println("Min integer: " + Math.min(x, y));

    }
}
