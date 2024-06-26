import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

    private static String URL = "jdbc:postgresql://localhost:5432/TestDB";
    private static String USERS = "postgres";
    private static String PASWORD = "1234";
    public static Connection getConnection(){


        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL , USERS , PASWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }
}
