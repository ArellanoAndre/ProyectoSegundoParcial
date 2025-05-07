/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Entidades.Compra;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
 *
 * @author Arell
 */
public class Control_Compra {
    private Connection conexion;

    public Control_Compra() {
         Conexion con = new Conexion(); // Usa tu clase Conexion
        this.conexion = con.getConexion(); // Obtiene la conexión
    }
    
public void registrarCompra(Compra compra) throws SQLException {
    String sql = "{CALL sp_registrar_compra(?, ?, ?, ?)}";
    
    try (
         CallableStatement stmt = conexion.prepareCall(sql)) {
        
        stmt.setInt(1, compra.getProductoId());
        stmt.setInt(2, compra.getAdminId());
        stmt.setInt(3, compra.getCantidad());
        stmt.setDouble(4, compra.getPrecioUnitario());
        
        stmt.execute();
        
        // Opcional: Obtener el ID generado si tu SP lo devuelve
        try (ResultSet rs = stmt.getGeneratedKeys()) {
            if (rs.next()) {
                compra.setId(rs.getInt(1));
            }
        }
    }
}
     
     public double obtenerPrecioCompra(int productoId) throws SQLException {
    double precio = 0;
    String sql = "{CALL sp_obtener_precio_compra(?, ?)}";
    
    try (
         CallableStatement stmt = conexion.prepareCall(sql)) {
        
        stmt.setInt(1, productoId);
        stmt.registerOutParameter(2, Types.DECIMAL);
        
        stmt.execute();
        
        precio = stmt.getDouble(2);
    } catch (SQLException e) {
        throw new SQLException("Error al obtener precio de compra: " + e.getMessage());
    }
    
    return precio;
}
    public double obtenerPrecioProducto(int id) throws SQLException {
    String sql = "SELECT precioCompra FROM productos WHERE id = ?";
    try (PreparedStatement ps = conexion.prepareStatement(sql)) {
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getDouble("precioCompra");
        }
        return 0;
    }
}
}
