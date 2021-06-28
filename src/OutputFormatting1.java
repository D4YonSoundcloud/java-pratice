import java.util.Scanner;

public class OutputFormatting1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //% = formatter '-': used for left indentation of string
            //15s = strings minimum field width 15
            //0 = pads the extra 0s of the integer
            //3d = integers minimum field 3
            //%n prints the new line
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }
}

