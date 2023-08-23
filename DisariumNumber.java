package Assignment;

public class DisariumNumber {
    // Function to calculate the power of a number
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    // Function to count the number of digits in a number
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    // Function to check if a number is a Disarium number
    public static boolean isDisarium(int num) {
        int temp = num;
        int digitCount = countDigits(num);
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += power(digit, digitCount);
            temp /= 10;
            digitCount--;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        int number = 89;

        if (isDisarium(number)) {
            System.out.println(number + " is a Disarium number.");
        } else {
            System.out.println(number + " is not a Disarium number.");
        }
    }
}
