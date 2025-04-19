package dayNineteen;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // greet();
        // printUntilNumber(5);
        // division(3, 5);
        // divisibleByThreeInRange();
        // System.out.println(alwaysReturn(7, 4));
        /* double number = 4 * alwaysReturnTen() + (alwaysReturnTen() / 2) - 8;
        System.out.println("The result of the calculation is " + number); */
        // beginningToMiddle(5,10);

        multiplicationTable(3);
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

    public static int alwaysReturn(int n1, int n2) {
        int result = n1 + n2;
        
        return result;
    }
    
    public static int alwaysReturnTen() {
        return 10;
    }

    public static void beginningToMiddle(int start, int end) {
        int middle = (start + end) / 2;
        while (start < middle) {
            System.out.println("step");
            start++;
        }
    }

    public static void multiplicationTable(int max) {
        int number = 1;

        while (number <= max) {
            printMultiplicationTableRow(number, max);
            number++;
        }
    }

    public static void printMultiplicationTableRow(int number, int coefficient) {
        int printable = number;
        while (printable <= number * coefficient) {
            System.out.print(" " + printable);
            printable += number;
        }
        System.out.println("");
    }
}
