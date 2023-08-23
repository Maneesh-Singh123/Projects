package Assignment;
import java.util.*;

public class LinearSearch {
 public static void main(String[] args) {
      
   int[]  arr = {1,5,4,6,1,8,1};
   Arrays.sort(arr);
  Scanner scan = new Scanner(System.in) ;
        // Create an instance of the Search class
         System.out.println("Enter the element that you want to check:");
            int search = scan.nextInt();  
            scan.close();  
        Search(arr,search); // Call the startSearch method on the instance
    }
  
    public static void Search(int arr[],int search) {
         System.out.println("Elements present in the array:");
            for (int i = 0; i <arr.length; i++) {
              if(search==(arr[i])){
                System.out.println(arr[i]);
              }
            }         
    }
}
