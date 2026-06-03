import java.util.Scanner;

public class Exercise10_BreakIntegerIntoDigits {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Input six non-negative digits: ");
        String number = s.next();

        for (char digit : number.toCharArray()) {
            System.out.print(digit + " ");
        }

    }
}
