import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n===== MOVIE TICKET BOOKING SYSTEM =====");

            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Show Movies");
            System.out.println("4. Book Ticket");
            System.out.println("5. Payment");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    Register.registerUser();
                    break;

                case 2:
                    Login.loginUser();
                    break;

                case 3:
                    Movie.showMovies();
                    break;

                case 4:
                    Booking.bookTicket();
                    break;

                case 5:
                    Payment.makePayment();
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}