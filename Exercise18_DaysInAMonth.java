import java.time.YearMonth;
import java.util.Scanner;

public class Exercise18_DaysInAMonth {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Input a month number: ");
        int month = s.nextInt();

        System.out.print("Input a year: ");
        int year = s.nextInt();

        int days = YearMonth.of(year, month).lengthOfMonth();

        System.out.println(days + " days");

    }
}
