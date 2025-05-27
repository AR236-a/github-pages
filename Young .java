import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        double amarHeight = scanner.nextDouble();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = scanner.nextDouble();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = scanner.nextDouble();

        
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngest = (youngestAge == amarAge) ? "Amar" :
                          (youngestAge == akbarAge) ? "Akbar" : "Anthony";

                
                double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
                String tallest = (tallestHeight == amarHeight) ? "Amar" :
                                 (tallestHeight == akbarHeight) ? "Akbar" : "Anthony";
        
                
                System.out.println("The youngest friend is " + youngest + ".");
                System.out.println("The tallest friend is " + tallest + ".");
        
                scanner.close();
            }
        }


