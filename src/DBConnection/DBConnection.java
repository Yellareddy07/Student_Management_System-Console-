package DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String url="jdbc:mysql://localhost:3306/projectsdb";
    private static final String username="root";
    private static final String password="root1";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to Database");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

}
