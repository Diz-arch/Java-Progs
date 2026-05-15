import java.util.Scanner;

public class StringStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        int spaceCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (ch == ' ') {
                spaceCount++;
            }
        }
        System.out.println("\n--- String Statistics ---");
        System.out.println("Uppercase characters : " + upperCount);
        System.out.println("Lowercase characters : " + lowerCount);
        System.out.println("Digits               : " + digitCount);
        System.out.println("Spaces               : " + spaceCount);
        System.out.println("-------------------------");

        scanner.close();
    }
}