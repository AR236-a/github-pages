import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Multiples of " + num + " below 100 are:");
        for (int i = 100; i > 0; i--) {
            if (i % num == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
