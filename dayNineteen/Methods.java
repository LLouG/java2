package dayNineteen;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // greet();
        // printUntilNumber(5);
        // division(3, 5);
        divisibleByThreeInRange();
    }
    
    
    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times? ");
        int printThis = Integer.valueOf(scanner.nextLine());
        
        for (int i = 0; i < printThis; i++) {
            System.out.println("In a hole in the ground there lived a method");
        }
    }
    
    public static void printUntilNumber(int number)
    {
        int i = 1;
        
        /* while (i <= number) {
            System.out.println(i++);
            } */
           while (number >= i) {
               System.out.println(number--);
        }
    
    }
    
    public static void division(int numerator, int denominator) {
        double result = (double)numerator/denominator;

        System.out.println(result);
    }

    public static void divisibleByThreeInRange() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the starting number: ");
        int beginning = Integer.valueOf(scanner.nextLine());

        System.out.print("What is the end number? ");
        int end = Integer.valueOf(scanner.nextLine());

        while (beginning <= end) {
            System.out.println(beginning);
            beginning+=3;

            if (beginning >= end) {
                break;
            }
        }
    }
}
