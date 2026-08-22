public class Pattern23 {
    public static void main(String[] args) {
        // Upper pyramid
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(".");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lower pyramid (inverted)
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(".");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}