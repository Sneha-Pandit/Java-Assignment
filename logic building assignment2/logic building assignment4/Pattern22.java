public class Pattern22 {
    public static void main(String[] args) {

        // Top line
        for (int j = 1; j <= 6; j++) {
            System.out.print("*");
        }
        System.out.println();

        // Middle lines
        for (int i = 1; i <= 4; i++) {
            System.out.print("*");

            for (int j = 1; j <= 4; j++) {
                System.out.print(" ");
            }

            System.out.println("*");
        }

        // Bottom line
        for (int j = 1; j <= 6; j++) {
            System.out.print("*");
        }
    }
}