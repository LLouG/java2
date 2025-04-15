package daySixteen;

import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        /* Loops loops = new Loops();
        loops.askNumbers(); */

        ContinueLoop cloop = new ContinueLoop();
        cloop.continueLoop();
    }
}


class Loops {
    Scanner reader = new Scanner(System.in);
    int numbersRead;
    int sum;

    public void askNumbers() {
        while (true) {
            if (numbersRead == 5) {
                break;
            }

            System.out.println("Input number:");
            sum += Integer.valueOf(reader.nextLine());
            numbersRead++;
        }
        System.out.println("The sum of the numbers is " + sum);
    }
    /* String text = reader.nextLine();
        int num = Integer.valueOf(reader.nextLine());
        double numberWithDecimals = Double.valueOf(reader.nextLine());
        boolean trueOrFalse = Boolean.valueOf(reader.nextLine()); */
}

class ContinueLoop extends Loops {
    public void continueLoop() {
        while (true) {
            System.out.println("Insert positive a number (0 to quit)");
            int number = Integer.valueOf(reader.nextLine());

            if (number < 0) {
                System.out.println("Unfit number! Try again.");
                continue;
            }
            
            if (number == 0) {
                break;
            }
            
                System.out.println("The square of " + number + " is " + number * number);
        }
    }
}