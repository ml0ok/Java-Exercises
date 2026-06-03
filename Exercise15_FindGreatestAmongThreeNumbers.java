import java.util.Scanner;

public class Exercise15_FindGreatestAmongThreeNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int x = s.nextInt();

        System.out.print("Input the 2nd number: ");
        int y = s.nextInt();

        System.out.print("Input the 3rd number: ");
        int z = s.nextInt();

        int max = x;

        if (y > max)
            max = y;

        if (z > max)
            max = z;

        System.out.println("The greatest: " + max);

    }
}
