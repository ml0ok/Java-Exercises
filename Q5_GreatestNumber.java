import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int a = s.nextInt();

        System.out.print("Input the 2nd number: ");
        int b = s.nextInt();

        System.out.print("Input the 3rd number: ");
        int c = s.nextInt();

        int max = a;

        if (b > max)
            max = b;

        if (c > max)
            max = c;

        System.out.println("The greatest: " + max);
    }
}
