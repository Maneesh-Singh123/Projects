package Assignment;
public class AlphabetPattern {
    public static void main(String[] args) {
        int n = 5; // The number of rows for the pattern

        for (int i = 0; i < n; i++) {
            char alphabet = 'A'; // Starting alphabet for each row

            for (int j = 0; j <= i; j++) {
                System.out.print(alphabet);
                alphabet++; // Increment the alphabet for the next iteration
            }

            System.out.println(); // Move to the next line for the next row
        }
    }
}
