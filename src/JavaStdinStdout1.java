import java.util.*;

public class JavaStdinStdout1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //does the same thing as above but a little less readable, but less LOC
        System.out.println(a + "/n" + b + "/n" + c);
    }
}
