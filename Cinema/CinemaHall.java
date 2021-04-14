package Cinema;

public class CinemaHall {

    private int row;
    private int seats;
    private int ticketPrice;


    private int currentIncome;
    private double percentage;
    private int totalIncome;
    private int countTicket;

    private String[][] hall;

    public String getCurrentIncome() {
        return "Current income: $" + currentIncome;
    }
    // percentage of cinemaHall filling
    public double getPercentage() {
        return percentage = (double) countTicket / (row * seats) * 100;
    }

    public String getTotalIncome() {
        return "Total income: $" + totalIncome;
    }

    public String getCountTicket() {
        return "Number of tickets purchased: " + countTicket;
    }

    public String getTicketPrice() {
        return "Ticket price: $" + ticketPrice;
    }

    public CinemaHall(int row, int seats, int ticketPrice) {
        this.row = row;
        this.seats = seats;
        this.ticketPrice = ticketPrice;
        this.hall = new String[row][seats];
        totalIncome = row * seats * ticketPrice;
        // fills hall
        for (int i = 0; i < row; i++)
            for (int j = 0; j < seats; j++) {
                hall[i][j] = "*";
            }
    }

    public void buyTicket() {
        try {
            System.out.println("Enter a row number:");
            int buyRow = Input.row() - 1;
            System.out.println("Enter a seat number in that row:");
            int buySeat = Input.seat() - 1;
            if (hall[buyRow][buySeat].equals("B")) {
                System.out.println("That ticket has already been purchased!");
            } else {
                hall[buyRow][buySeat] = "B";
                System.out.println("You have successfully bought a ticket.");
                System.out.println(getTicketPrice());
                currentIncome += ticketPrice;
                countTicket++;
//                percentage = (double) countTicket / (row * seats) * 100;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong seat! Choose a seat within the hall");
        } catch (Exception e) {
            System.out.println("Incorrect input, pls try only digits");
        }
    }


    public void statistics() {
        System.out.println(getCountTicket());
        System.out.printf("Fill percentage: %.2f%%\n", getPercentage());
        System.out.println(getCurrentIncome());
        System.out.println(getTotalIncome());
    }


    public void printHall() {
        int numberRows = 1;
        System.out.println("");
        System.out.println("Cinema: ");
        System.out.print(" ");

        for (int i = 1; i <= seats; i++) {
            System.out.print(" ");
            System.out.print(i);
        }
        System.out.println("");
        for (String[] arr : hall) {
            System.out.print(numberRows++ + " ");
            for (String arr2 : arr) {
                System.out.print(arr2 + " ");
            }
            System.out.println();
        }
        System.out.println("");
    }
}
