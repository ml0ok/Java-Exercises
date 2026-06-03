import java.util.Scanner;

public class Exercise07_AverageOfThreeNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Input first number: ");
        int x = s.nextInt();

        System.out.print("Input second number: ");
        int y = s.nextInt();

        System.out.print("Input third number: ");
        int z = s.nextInt();

        double average = (x + y + z) / 3.0;

        System.out.println("Average = " + average);

    }
}
