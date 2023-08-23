package Assignment;
public class CheckPalindromeUsingRecursion {
    
    public static boolean isPalindrome(int num, int originalNum) {
        if (num == 0) {
            return originalNum == 0;
        }
        
        if (!isPalindrome(num / 10, originalNum)) {
            return false;
        }
        
        if (num % 10 != originalNum % 10) {
            return false;
        }
        
        originalNum /= 10;
        return true;
    }
    
    public static void main(String[] args) {
        int number = 12321;
        
        if (isPalindrome(number, number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
