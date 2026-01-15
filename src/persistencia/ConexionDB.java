package persistencia;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexionDB {

    private static String URL;
    private static String USER;
    private static String PASS;

    static {
        try (InputStream input = ConexionDB.class
                .getClassLoader()
                .getResourceAsStream("config.properties")) {

            Properties prop = new Properties();
            prop.load(input);

            URL = prop.getProperty("db.url");
            USER = prop.getProperty("db.user");
            PASS = prop.getProperty("db.pass");

        } catch (Exception e) {
            System.out.println("Error cargando config.properties");
            e.printStackTrace();
        }
    }//unacontri

    public static Connection getConexion() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        Connection conn = getConexion();

        if (conn != null) {
            System.out.println("Conexión exitosa a SQL Server");
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No se pudo conectar a la base de datos");
        }
    }
}
