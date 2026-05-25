import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Booking {

    public static void bookTicket() {

        try {

            Connection con = DBConnection.getConnection();

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Movie Name: ");
            String movie = sc.nextLine();

            System.out.print("Enter Seats: ");
            int seats = sc.nextInt();

            String query =
            "INSERT INTO bookings(username,movie_name,seats_booked) VALUES(?,?,?)";

            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, username);
            pst.setString(2, movie);
            pst.setInt(3, seats);

            pst.executeUpdate();

            System.out.println("Ticket Booked Successfully");

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}