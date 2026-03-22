import java.sql.*;

public class SqlInjectionDemo {
    public void buscarUsuario(String nombre) throws Exception {
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost/db", "root", "root");
        String query = "SELECT * FROM usuarios WHERE nombre = '" + nombre + "'";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
    }
}
