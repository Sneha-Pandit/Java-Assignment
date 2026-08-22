public class StringLiteral {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        
        // Using == checks if both point to same object
        if (str1 == str2) {
            System.out.println("Both variables point to the same object: true");
        } else {
            System.out.println("Both variables point to the same object: false");
        }
    }
}