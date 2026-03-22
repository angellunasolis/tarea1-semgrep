import java.sql.*;

public class HardcodedPasswordDemo {
    public static void main(String[] args) throws Exception {
        String password = "SuperSecreto123";
        String user = "admin";
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost/db", user, password);
    }
}
