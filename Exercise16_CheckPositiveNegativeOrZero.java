import java.util.Scanner;

public class Exercise16_CheckPositiveNegativeOrZero {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Input a number: ");
        double n = s.nextDouble();

        if (n == 0) {

            System.out.println("zero");

        } else {

            if (n > 0)
                System.out.print("positive ");
            else
                System.out.print("negative ");

            if (Math.abs(n) < 1)
                System.out.print("small");
            else if (Math.abs(n) > 1000000)
                System.out.print("large");
        }
    }
}
