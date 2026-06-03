import java.util.Scanner;

public class Exercise20_SumAndAverageOf5Numbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int sum = 0;

        System.out.print("Input the 5 numbers: ");

        for (int i = 0; i < 5; i++) {
            sum += s.nextInt();
        }

        double average = sum / 5.0;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }
}
