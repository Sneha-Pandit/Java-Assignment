import java.util.Scanner;
public class CountPosNeg {


public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== QUESTION 11: Count Positive and Negative Numbers in an Array ===");
        System.out.print("Enter 6 integers: ");
        
        int[] arr = new int[6];
        int positive = 0, negative = 0;
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            }
        }
        
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
    }
}