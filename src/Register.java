import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Register {

    public static void registerUser() {

        try {

            Connection con = DBConnection.getConnection();

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            String query = "INSERT INTO users(username,password) VALUES(?,?)";

            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, username);
            pst.setString(2, password);

            pst.executeUpdate();

            System.out.println("Registration Successful");

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}