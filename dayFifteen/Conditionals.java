package dayFifteen;

import java.util.Scanner;
// alt + shift + F fix some of the indentation problems

public class Conditionals {
    public static void main(String[] args) {
        /*
         * SpeedingTicket ticket = new SpeedingTicket();
         * ticket.speedingTicket(0);
         */

        /* IsGreater myInt = new IsGreater(7, 7); */

        FizzBuzz fizzbuzz = new FizzBuzz();
        fizzbuzz.fizzbuzz();
    }
}

class SpeedingTicket {
    Scanner scanner = new Scanner(System.in);

    public void speedingTicket(int speed) {
        System.out.println("Give speed:");
        speed = Integer.parseInt(scanner.nextLine());

        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}

class IsGreater {
    public IsGreater(int first, int second) {
        if (first < second) {
            System.out.println(first + " is less than " + second);
        } else if (first > second) {
            System.out.println(first + " is greater than " + second);
        } else {
            System.out.println(first + " and " + second + " are equal");
        }
    }
}

class FizzBuzz {
    Scanner scanMyNum = new Scanner(System.in);
    int myInt;

    public void fizzbuzz() {
        System.out.println("Say a number between 1 and 100");
        myInt = Integer.parseInt(scanMyNum.nextLine());

        if (myInt % 5 == 0 && myInt % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (myInt % 5 == 0) {
            System.out.println("Buzz");
        } else if (myInt % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(myInt + " is not divisible by 3 nor 5!");
        }
    }
}