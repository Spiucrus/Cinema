package cinema;

public class TestCinema {

    public static void main(String[] args) {
        /**
         *  Create cinema
         * @Input row
         * @Input seats
         * @Input ticket price
         */
        CinemaHall cinemaHall = new CinemaHall(Input.numberOfRows(), Input.numberOfSeats(),Input.ticketPrice());
        while (true) {
            System.out.println("1. Show the seats\n" +
                    "2. Buy a ticket\n" +
                    "3. Statistics\n" +
                    "0. Exit");
            try {
                switch (Input.choice()) {
                    case 1:
                        cinemaHall.printHall();
                        break;
                    case 2:
                        cinemaHall.buyTicket();
                        break;
                    case 3:
                        cinemaHall.statistics();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Input wrong number");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Incorrect input in menu. Use digits");
                System.exit(0);
            }
        }
    }
}


