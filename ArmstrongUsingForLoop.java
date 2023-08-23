package Assignment;
import java.util.Scanner;

public class ArmstrongUsingForLoop {
    static int n;

    public static void main(String arg[]) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is an Armstrong number or not: ");
        n = k.nextInt();
        k.close();

        int res = 0;
        int temp = n;
        int len = Integer.toString(n).length();
        for (; n > 0; n /= 10) {
            int r = n % 10;
            res += Math.pow(r, len);
        }

        if (res == temp) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
