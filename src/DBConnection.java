import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection con;

    public static Connection getConnection() {

        try {

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/movie_booking",
                "root",
                "root"
            );

            System.out.println("Connected Successfully");

        } catch(Exception e) {

            System.out.println(e);
        }

        return con;
    }

    public static void main(String[] args) {

        getConnection();
    }
}