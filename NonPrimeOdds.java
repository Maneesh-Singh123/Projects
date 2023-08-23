package Assignment;
import java.util.Scanner;

public class NonPrimeOdds {
    static int num;

    public static void main(String arg[]) {
        int count = 0;
        Scanner k = new Scanner(System.in);
        System.out.println("Enter how many non-prime odd numbers you want to print");
        num = k.nextInt();
        for (int i = 1; count < num; i=i+2) {
            if (checkNonPrimeodd(i)) {
                System.out.println(i);
                count++;
            }
        }
        k.close();
    }

    public static boolean checkNonPrimeodd(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 ) {
                c++;

            }
        }
        if (c >= 3) {
            return true;
        } else {
            return false;
        }
    }
}