/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Entidades.ProductoCarrito;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aleja
 */
public class ControlCarrito {

    private Connection conexion;

    public ControlCarrito() {
        Conexion con = new Conexion(); // Usa tu clase Conexion
        this.conexion = con.getConexion(); // Obtiene la conexión

    }

    /**
     * Agrega un producto al carrito del usuario
     */
    public boolean agregarProductoCarrito(int usuarioId, int productoId, int cantidad) {
        // Primero verificar si el usuario existe
        if (!validarUsuarioExistente(usuarioId)) {
            System.err.println("Error: El usuario con ID " + usuarioId + " no existe");
            return false;
        }

        String sql = "{CALL sp_AgregarProductoCarrito(?, ?, ?)}";
        try (CallableStatement stmt = conexion.prepareCall(sql)) {
            stmt.setInt(1, usuarioId);
            stmt.setInt(2, productoId);
            stmt.setInt(3, cantidad);
            stmt.execute();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al agregar producto al carrito: " + e.getMessage());
            return false;
        }
    }

    private boolean validarUsuarioExistente(int usuarioId) {
        String sql = "SELECT COUNT(*) FROM usuario WHERE ID = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, usuarioId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            System.err.println("Error al validar usuario: " + e.getMessage());
        }
        return false;
    }

    /**
     * Elimina un producto del carrito
     */
    public boolean quitarProductoCarrito(int usuarioId, int productoId, int cantidad) {
        String sql = "{CALL sp_QuitarProductoCarrito(?, ?, ?)}";
        try (CallableStatement stmt = conexion.prepareCall(sql)) {
            stmt.setInt(1, usuarioId);
            stmt.setInt(2, productoId);
            stmt.setInt(3, cantidad);
            stmt.execute();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al quitar producto del carrito: " + e.getMessage());
            return false;
        }
    }

    public boolean comprarCarrito(int usuarioId) {
        String sql = "{CALL sp_ComprarCarrito(?)}";
        try (CallableStatement stmt = conexion.prepareCall(sql)) {
            stmt.setInt(1, usuarioId);
            stmt.execute();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al realizar la compra: " + e.getMessage());
            return false;
        }
    }

    public List<ProductoCarrito> verCarrito(int usuarioId) {
        List<ProductoCarrito> productosCarrito = new ArrayList<>();
    String sql = "{CALL sp_VerCarrito(?)}";

    try (CallableStatement stmt = conexion.prepareCall(sql)) {
        stmt.setInt(1, usuarioId);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            ProductoCarrito pc = new ProductoCarrito();
            pc.setId(rs.getInt("detalle_id")); // Detalle ID
            pc.setProductoId(rs.getInt("producto_id")); // Producto ID
            pc.setMarca(rs.getString("marca")); // Marca
            pc.setModelo(rs.getString("modelo")); // Modelo
            pc.setCantidad(rs.getInt("cantidad")); // Cantidad
            pc.setPrecioUnitario(rs.getDouble("precio_unitario")); // Precio Unitario
            pc.setTotalProducto(rs.getDouble("total_producto")); // Total por Producto

            productosCarrito.add(pc);
        }
    } catch (SQLException e) {
        System.err.println("Error al obtener carrito: " + e.getMessage());
    }

    return productosCarrito;
    }

    public double calcularTotalCarrito(int usuarioId) {
        double total = 0.0;
        String sql = "{CALL sp_TotalCarrito(?)}";

        try (CallableStatement stmt = conexion.prepareCall(sql)) {
            stmt.setInt(1, usuarioId);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                total = rs.getDouble(1); // El SP devuelve un único valor
            }
        } catch (SQLException e) {
            System.err.println("Error al calcular total del carrito: " + e.getMessage());
        }

        return total;
    }

    public List<Object[]> obtenerDetallesCarrito(int usuarioId) {
        List<Object[]> detalles = new ArrayList<>();
        String sql = "{CALL sp_VerCarrito(?)}";

        try (CallableStatement stmt = conexion.prepareCall(sql)) {
            stmt.setInt(1, usuarioId);
            ResultSet rs = stmt.executeQuery();

            // Aquí lnt no sé si se deban poner más cosas a la tabla o nomás con lo q estaba, pq asi está en el SP
            while (rs.next()) {
                Object[] fila = new Object[6];
                fila[0] = rs.getInt("producto_id");
                fila[1] = rs.getString("marca");
                fila[2] = rs.getString("modelo");
                fila[3] = rs.getInt("cantidad");
                fila[4] = rs.getDouble("precio_unitario");
                fila[5] = rs.getDouble("total_producto");

                detalles.add(fila);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener detalles del carrito: " + e.getMessage());
        }

        return detalles;
    }
}
