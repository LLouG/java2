package dayFourteen;
import java.util.Scanner;


public class Conditionals {
    public static void main(String[] args) {
        Convert myInt = new Convert();
        myInt.ask();
    }
}

class Convert {
    Scanner scanner = new Scanner(System.in);
    int value;
    
    public void ask()
    {
        System.out.println("Write a value");
        value = Integer.valueOf(scanner.nextLine());
        System.out.println("You wrote " + value);

        /* return value;  -> return doesn't work with void 
         * it needs -> public int ask()
        */

        // double floatingPoint = Double.valueOf(scanner.nextLine());
        // boolean trueOrFalse = Boolean.valueOf(scanner.nextLine());
    }
}