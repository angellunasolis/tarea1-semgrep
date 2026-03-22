import java.sql.*;

public class HardcodedPasswordDemo {
    public static void main(String[] args) throws Exception {
        String password = System.getenv("DB_PASSWORD");
        String user = System.getenv("DB_USER");
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost/db", user, password);
    }
}
