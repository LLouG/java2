package daySeventeen;

import java.util.Scanner;

public class CalcPercentage {
    public static void main(String[] args) {
        PositivesAndNegatives myNum = new PositivesAndNegatives();
        myNum.askForNumbers();
    }
}

class PositivesAndNegatives {
    Scanner scanner = new Scanner(System.in);

    int numberOfPositives = 0;
    int numberOfNegatives = 0;
    double percentageOfPositives;

    public void askForNumbers() {
        while (true) {
            System.out.println("Enter a number (0 to quit)");
            int currentInput = Integer.valueOf(scanner.nextLine());

            if (currentInput <= -1) {
                numberOfNegatives++;
            } else if (currentInput >= 1) {
                numberOfPositives++;
            } else {
                percentageOfPositives = 100.0 * numberOfPositives / (numberOfPositives + numberOfNegatives);
                System.out.println(percentageOfPositives + "% of the numbers were positive.");
                break;
            }
            System.out.println("Currently there are " + numberOfPositives + " positive numbers and " + numberOfNegatives
                    + " negative numbers");
        }
    }
}