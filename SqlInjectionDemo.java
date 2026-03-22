import java.sql.*;

public class SqlInjectionDemo {
    public void buscarUsuario(String nombre) throws Exception {
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost/db",
            System.getenv("DB_USER"),
            System.getenv("DB_PASSWORD"));
        String query = "SELECT * FROM usuarios WHERE nombre = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
    }
}
