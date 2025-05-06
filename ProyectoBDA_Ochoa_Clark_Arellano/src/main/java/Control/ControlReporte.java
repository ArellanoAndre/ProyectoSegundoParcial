/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Entidades.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aleja
 */
public class ControlReporte {

    private Connection conexion;

    public ControlReporte() {
        Conexion con = new Conexion(); // Usa tu clase Conexion
        this.conexion = con.getConexion(); // Obtiene la conexión
    }

    // Método para obtener todos los productos con su existencia
    public List<Producto> verExistenciaProductoTodos() {
        List<Producto> listaProductos = new ArrayList<>();
        String sql = "{CALL sp_ProductoExistencia()}";  // Llamada sin parámetros para obtener todos los productos

        try (CallableStatement stmt = conexion.prepareCall(sql)) {
            ResultSet rs = stmt.executeQuery();  // Ejecutamos la consulta sin parámetros

            while (rs.next()) {
                Producto producto = new Producto();
                producto.setId(rs.getInt("id"));      // ID del producto
                producto.setProducto(rs.getString("producto")); //producto
                producto.setMarca(rs.getString("marca"));       // Marca
                producto.setModelo(rs.getString("modelo"));     // Modelo
                producto.setDescripcion(rs.getString("descripcion"));  // Descripción
                producto.setCantidadStock(rs.getInt("cantidad_stock"));  // Existencia del producto

                listaProductos.add(producto);  // Agregar el producto a la lista
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener existencia del producto: " + e.getMessage());
        }

        return listaProductos;  // Devolvemos la lista de productos
    }

    // Método para obtener productos filtrados por nombre del producto
    public List<Producto> verProductosConFiltroPorNombre(String producto) {
        List<Producto> listaProductos = new ArrayList<>();
        String sql = "{CALL sp_FiltroProductoExistencia(?)}";

        try (CallableStatement stmt = conexion.prepareCall(sql)) {
            // Si el nombre del producto es null, se pasa null al SP, sino se pasa el valor ingresado
            stmt.setString(1, producto != null && !producto.isEmpty() ? producto : null);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt("id"));
                p.setProducto(rs.getString("producto"));
                p.setMarca(rs.getString("marca"));
                p.setModelo(rs.getString("modelo"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setCantidadStock(rs.getInt("cantidad_stock"));

                listaProductos.add(p);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener productos filtrados: " + e.getMessage());
        }

        return listaProductos;
    }

}
