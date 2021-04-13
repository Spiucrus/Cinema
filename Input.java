package cinema;

import java.util.Scanner;

public interface Input {
    Scanner scanner = new Scanner(System.in);

    static int numberOfRows() {
        System.out.println("Enter the number of rows:");
        return scanner.nextInt();
    }
    static  int numberOfSeats() {
        System.out.println("Enter the number of seats:");
        return scanner.nextInt();
    }

    static int row() {
        return scanner.nextInt();
    }

    static int seat() {
        return scanner.nextInt();
    }

    static int choice() {
        return scanner.nextInt();
    }
    static int ticketPrice() {
        System.out.println("Enter ticket price:");
        return scanner.nextInt();
    }


}
