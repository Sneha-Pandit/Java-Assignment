import java.util.Scanner;
public class LargestElement1 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the Largest Element in an Array ===");
        System.out.println("Enter 5 integers: ");
        
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println("The largest element is: " + max);
   
  }
 }