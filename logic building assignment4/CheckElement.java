import java.util.Scanner;
import java.util.Arrays;

public class CheckElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the number to search: ");
        int search = sc.nextInt();
        
        if (Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)).contains(search)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}