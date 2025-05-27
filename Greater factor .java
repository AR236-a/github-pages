import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int greatestFactor = 1;

        for (int i = num - 1; i > 0; i--) {
            if (num % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("The greatest factor of " + num + " (besides itself) is " + greatestFactor);
        scanner.close();
    }
}