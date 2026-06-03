public class Exercise12_CompareSignedUnsigned {

    public static void main(String[] args) {

        int x = -1;
        int y = 1;

        System.out.println("Signed comparison: " + Integer.compare(x, y));
        System.out.println("Unsigned comparison: " + Integer.compareUnsigned(x, y));

    }
}
