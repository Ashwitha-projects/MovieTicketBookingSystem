import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Payment {

    public static void makePayment() {

        try {

            Connection con = DBConnection.getConnection();

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();

            String query =
            "INSERT INTO payments(username,amount) VALUES(?,?)";

            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, username);
            pst.setDouble(2, amount);

            pst.executeUpdate();

            System.out.println("Payment Successful");

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}