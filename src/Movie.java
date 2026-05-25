import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Movie {

    public static void showMovies() {

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM movies");

            System.out.println("\nAvailable Movies");

            while(rs.next()) {

                System.out.println(
                    rs.getInt("movie_id") + " " +
                    rs.getString("movie_name") + " Seats: " +
                    rs.getInt("seats_available")
                );
            }

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}