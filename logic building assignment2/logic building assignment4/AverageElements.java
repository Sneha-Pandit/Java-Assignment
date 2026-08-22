import java.util.Scanner;
public class AverageElements {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Find the Average of Elements in an Array ===");
        System.out.print("Enter 5 integers: ");
        
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        double average = sum / 5.0;
        System.out.println("The average of the numbers is: " + average);
    }  
  }