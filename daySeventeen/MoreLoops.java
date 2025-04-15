package daySeventeen;
import java.util.Scanner;


public class MoreLoops {
    public static void main(String[] args) {
        PositivesAndNegatives myNum = new PositivesAndNegatives();
        myNum.askForNumbers();
    }    
}

class PositivesAndNegatives {
    Scanner scanner = new Scanner(System.in);

    int numberOfPositives;
    int numberOfNegatives;
    double percentageOfPositives;

    public void askForNumbers() {
            while (true) {            
            int total = 0;
            System.out.println("Enter a number (0 to quit)");

            if (Integer.valueOf(scanner.nextLine()) < 0) {
                numberOfNegatives++;
                total++;
            } else if (Integer.valueOf(scanner.nextLine()) > 0) {
                numberOfPositives++;
                total++;
                // numberOfPositives++ only works after typing 2 positive numbers in a row, WHY?
            } else {
                percentageOfPositives = 100.0 * numberOfPositives / (numberOfPositives + numberOfNegatives);
                System.out.println(percentageOfPositives + "% of the numbers were positive.");
                break;
            }

            System.out.println("There are " + numberOfPositives + " positive numbers and " + numberOfNegatives + " negative numbers.");
        }
    }
}