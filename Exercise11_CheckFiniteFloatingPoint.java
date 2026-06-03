import java.util.Scanner;

public class Exercise11_CheckFiniteFloatingPoint {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Input a double value: ");
        double x = s.nextDouble();

        if (Double.isFinite(x)) {
            System.out.println("Finite floating-point value");
        } else {
            System.out.println("Not a finite floating-point value");
        }

    }
}
