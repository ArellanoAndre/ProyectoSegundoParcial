
package Control;

import Entidades.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Arell
 */
public class Conexion {
     //CONEXION CON LA BD
    private Connection conexion;

    public Conexion(Connection conexion) {
        this.conexion = conexion;
    }

    public Conexion() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/paneles", "root", "root");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
    }

    public Connection getConexion() {
    return conexion;
}
}