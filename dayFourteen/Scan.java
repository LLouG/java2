package dayFourteen;
import java.util.Scanner;


public class Scan {
    public static void main(String[] args) {
        /* Convert myInt = new Convert();
        myInt.ask(); */

        CalcAvg myAvgScore = new CalcAvg();
        myAvgScore.calcAvg(0, 0, 0);
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

class CalcAvg {
    Scanner scan = new Scanner(System.in);
    int score1, score2, score3;
    double avgScore;

    public void calcAvg(int score1, int score2, int score3)
    {
        System.out.println("Provide the FIRST score: ");
        score1 = Integer.valueOf(scan.nextLine());
        System.out.println("Provide the SECOND score: ");
        score2 = Integer.valueOf(scan.nextLine());
        System.out.println("Provide the THIRD score: ");
        score3 = Integer.valueOf(scan.nextLine());
        avgScore = ((score1 + score2 + score3) * 1.0 / 3);
        System.out.println("The average of the scores provided is " + avgScore);
    }
}