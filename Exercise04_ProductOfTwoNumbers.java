import java.util.Scanner;

public class Exercise04_ProductOfTwoNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Input first number: ");
        int x = s.nextInt();

        System.out.print("Input second number: ");
        int y = s.nextInt();

        System.out.println(x + " x " + y + " = " + (x * y));

    }
}
