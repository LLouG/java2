package dayEighteen;

import java.util.Scanner;

public class MoreLoops {
    public static void main(String[] args) {
        WhereFromTo whereFromTo = new WhereFromTo();
        whereFromTo.whereFromTo();

        calcFactorial calcFactorial = new calcFactorial();
        calcFactorial.factorial(5);
    }
}

class WhereFromTo {
    Scanner scanner = new Scanner(System.in);
    public int whereFrom, whereTo, sum = 0;

    public void whereFromTo() {
        System.out.print("Where from? ");
        whereFrom = Integer.valueOf(scanner.nextLine());
        System.out.print("Where to? ");
        whereTo = Integer.valueOf(scanner.nextLine());

        System.out.println("--------------------");
        for (int i = whereFrom; i <= whereTo; sum += i, i++) {
            System.out.println("|        " + i + "        |");
        }
        System.out.println("|       " + sum + "        |");
        System.out.println("--------------------");
    }
}

class calcFactorial {
    public void factorial(int n)
    {
        int res = 1, j;

        for (j = 2; j <= n; j++) {
            res *= j;
        }
        System.out.println("The factorial of " + n + " is " + res);
    }
}