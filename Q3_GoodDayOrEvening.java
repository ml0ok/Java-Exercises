import java.util.Scanner;
public class Q3_GoodDayOrEvening {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int time = s.nextInt();
        if (time < 18) System.out.println("Good Day");
        else System.out.println("Good Evening");
    }
}