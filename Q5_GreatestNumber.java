import java.util.Scanner;
public class Q5_GreatestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt(), b=s.nextInt(), c=s.nextInt();
        int max=a; if(b>max) max=b; if(c>max) max=c;
        System.out.println("The greatest: " + max);
    }
}