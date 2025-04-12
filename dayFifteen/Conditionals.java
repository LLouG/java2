package dayFifteen;

import java.util.Scanner;
// alt + shift + F fix some of the indentation problems


public class Conditionals {
    public static void main(String[] args) {
        SpeedingTicket ticket = new SpeedingTicket();
        ticket.speedingTicket(0);
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