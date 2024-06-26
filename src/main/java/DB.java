import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

    private static String URL = "url базы данных";
    private static String USERS = "имя пользователя";
    private static String PASWORD = "пароль";
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
