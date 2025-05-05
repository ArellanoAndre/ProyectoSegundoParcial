/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Entidades.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Arell
 */
public class Control_Productos {
    private Connection conexion;

    public Control_Productos() {
        Conexion con = new Conexion(); // Usa tu clase Conexion
        this.conexion = con.getConexion(); // Obtiene la conexión
    }
    
    
    // Insertar un producto
    public void insertarProducto(Producto producto) throws SQLException {
        String sql = "{CALL sp_insertarProducto(?, ?, ?, ?, ?, ?)}";
        try (CallableStatement stmt = conexion.prepareCall(sql)) {
            stmt.setString(1, producto.getProducto());
            stmt.setString(2, producto.getMarca());
            stmt.setString(3, producto.getModelo());
            stmt.setString(4, producto.getDescripcion());
            stmt.setDouble(5, producto.getPrecioCompra());
            stmt.setDouble(6, producto.getPrecioVenta());
            stmt.executeUpdate();
        }
    }
    public java.util.List<Producto> listarProductos() throws SQLException {
    java.util.List<Producto> productos = new java.util.ArrayList<>();
        String sql = "{CALL sp_listarProductos()}";
        try (CallableStatement stmt = conexion.prepareCall(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Producto p = new Producto(
                    rs.getInt("id"),
                    rs.getString("producto"),
                    rs.getString("marca"),
                    rs.getString("modelo"),
                    rs.getString("descripcion"),
                    rs.getDouble("precioCompra"),
                    rs.getDouble("precioVenta")
                );
                productos.add(p);
            }
        }
        return productos;
    }
    
    // Actualizar un producto
    public void actualizarProducto(Producto producto) throws SQLException {
        String sql = "{CALL sp_actualizarProducto(?, ?, ?, ?, ?, ?, ?)}";
        try (CallableStatement stmt = conexion.prepareCall(sql)) {
            stmt.setInt(1, producto.getId());
            stmt.setString(2, producto.getProducto());
            stmt.setString(3, producto.getMarca());
            stmt.setString(4, producto.getModelo());
            stmt.setString(5, producto.getDescripcion());
            stmt.setDouble(6, producto.getPrecioCompra());
            stmt.setDouble(7, producto.getPrecioVenta());
            stmt.executeUpdate();
        }
    }
    
    // Eliminar un producto
    public void eliminarProducto(int id) throws SQLException {
        String sql = "{CALL sp_eliminarProducto(?)}";
        try (CallableStatement stmt = conexion.prepareCall(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
    
    public java.util.List<Producto> listarProductosStock() throws SQLException {
    java.util.List<Producto> productos = new java.util.ArrayList<>();
    String sql = "{CALL sp_listarProductosStock()}";
    
    try (CallableStatement stmt = conexion.prepareCall(sql);
         ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
            Producto p = new Producto(
                rs.getInt("id"),  // Nuevo campo ID
                rs.getString("producto"),
                rs.getString("modelo"),
                rs.getInt("stock")
            );
            productos.add(p);
        }
    }
    return productos;
}
    
    public void aumentarStock(int id, int cantidad) throws SQLException {
    String sql = "UPDATE productos SET Cantidad_Stock = Cantidad_Stock + ? WHERE id = ?";
    try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
        stmt.setInt(1, cantidad);
        stmt.setInt(2, id);
        stmt.executeUpdate();
    }
}

public void actualizarStock(int id, int nuevaCantidad) throws SQLException {
    String sql = "UPDATE productos SET Cantidad_Stock = ? WHERE id = ?";
    try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
        stmt.setInt(1, nuevaCantidad);
        stmt.setInt(2, id);
        stmt.executeUpdate();
    }
}

}
