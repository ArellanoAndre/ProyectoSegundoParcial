/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Entidades.Rol;
import Entidades.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Arell
 */
public class Control_Usuario {
    private Connection conexion;

    public Control_Usuario() {
        Conexion con = new Conexion(); // Usa tu clase Conexion
        this.conexion = con.getConexion(); // Obtiene la conexión
    }
    
    
    
    
     //METODOS CRUD CON SP
     // Método para crear usuario
    public void crearUsuario(Usuario usuario) {
    try {
        CallableStatement stmt = conexion.prepareCall("{CALL sp_CrearUsuario(?, ?, ?, ?, ?, ?)}");

        stmt.setString(1, usuario.getNombreCompleto());
        stmt.setString(2, usuario.getNombreUsuario());
        stmt.setString(3, usuario.getDireccion());
        stmt.setString(4, usuario.getCorreo());
        stmt.setString(5, hashPassword(usuario.getContraseña())); // Encriptación
        stmt.setString(6, "CLIENTE");
        stmt.execute();
        JOptionPane.showMessageDialog(null, "Usuario creado exitosamente.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al crear usuario: " + e.getMessage());
    }
}
    // ACTUALIZAR USUARIO SP
    public void actualizarUsuario(Usuario usuario) {
    try {
        CallableStatement stmt = conexion.prepareCall("{CALL sp_ActualizarUsuario(?, ?, ?, ?, ?, ?)}");

        stmt.setLong(1, usuario.getId());
        stmt.setString(2, usuario.getNombreCompleto());
        stmt.setString(3, usuario.getNombreUsuario());
        stmt.setString(4, usuario.getDireccion());
        stmt.setString(5, usuario.getCorreo());
        stmt.setString(6, usuario.getRol().name());

        stmt.execute();
        JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar usuario: " + e.getMessage());
    }
}

    // OBTENER USUARIO
      // Método para obtener usuario por ID
    public void obtenerUsuario(int id) {
        try {
            CallableStatement stmt = conexion.prepareCall("{CALL sp_ObtenerUsuario(?)}");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "ID: " + rs.getInt("ID") + 
                        "\nNombre: " + rs.getString("NOMBRE") + 
                        "\nContraseña: " + rs.getString("CONTRASEÑA"));
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener usuario: " + e.getMessage());
        }
    }
   // ELIMINAR USUARIO
     // Método para eliminar usuario
    public void eliminarUsuario(int id) {
        try {
            CallableStatement stmt = conexion.prepareCall("{CALL sp_EliminarUsuario(?)}");
            stmt.setInt(1, id);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar usuario: " + e.getMessage());
        }
    }
    
    //LOGIN
        // Método para verificar usuario y contraseña usando el procedimiento almacenado
     // Método para verificar el login
    public int Loggin(Usuario usuario) {
        int userId = -1;

        try {
            CallableStatement stmt = conexion.prepareCall("{CALL SP_Loggin(?)}");
            stmt.setString(1, usuario.NombreUsuario);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String hashedPassword = rs.getString("CONTRASEÑA");

                // Verificar si la contraseña ingresada coincide con el hash almacenado
                if (BCrypt.checkpw(usuario.contraseña, hashedPassword)) {
                    userId = rs.getInt("ID"); // Retorna el ID del usuario
                    System.out.println("Loggin Exitoso");
                }
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en login: " + e.getMessage());
        }

        return userId; // Retorna -1 si no se encontró el usuario o la contraseña no es válida
    }
    
    public Rol obtenerRolPorId(int id) {
    Rol rol = null;

    try {
        CallableStatement stmt = conexion.prepareCall("{CALL sp_ObtenerRolPorId(?)}");
        stmt.setInt(1, id);

        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            rol = Rol.valueOf(rs.getString("ROL").toUpperCase());
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener el rol del usuario: " + e.getMessage());
    }

    return rol;
}


    // METODOS DE ENCRIPTACION
         // Método para encriptar la contraseña usando BCrypt
    private String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
    
    // Método para verificar la contraseña (al hacer login)
    public boolean verifyPassword(String password, String storedHashedPassword) {
        return BCrypt.checkpw(password, storedHashedPassword);
    }
    
    // Método para verificar si el hash es de BCrypt
    private boolean isBCryptHash(String hash) {
        return hash != null && hash.startsWith("$2a$") || hash.startsWith("$2b$") || hash.startsWith("$2y$");
    }

}
