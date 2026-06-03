import java.util.Scanner;

public class Exercise13_CheckPositiveOrNegative {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Input number: ");
        int n = s.nextInt();

        if (n > 0) {
            System.out.println("Number is positive");
        } else if (n < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

    }
}
