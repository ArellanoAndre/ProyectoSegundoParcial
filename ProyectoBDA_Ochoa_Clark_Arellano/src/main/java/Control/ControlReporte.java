/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Entidades.Producto;
import Entidades.VentaReporte;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
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

    public List<VentaReporte> obtenerReporteVentasPeriodo(java.sql.Date fechaInicio, java.sql.Date fechaFin) {
        List<VentaReporte> listaReporte = new ArrayList<>();
        String sql = "{CALL sp_ReporteRentasPeriodo(?, ?)}";

        try (CallableStatement stmt = conexion.prepareCall(sql)) {
            stmt.setDate(1, fechaInicio);
            stmt.setDate(2, fechaFin);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                VentaReporte venta = new VentaReporte();
                venta.setIdVenta(rs.getInt("ID Venta"));
                venta.setFecha(rs.getDate("fecha"));
                venta.setCliente(rs.getString("Cliente"));
                venta.setProducto(rs.getString("Producto"));
                venta.setMarca(rs.getString("Marca"));
                venta.setModelo(rs.getString("Modelo"));
                venta.setCantidadVendida(rs.getInt("Cantidad Vendida"));
                venta.setPrecioUnitario(rs.getDouble("Precio Unitario"));
                venta.setTotalVenta(rs.getDouble("Total Venta"));

                listaReporte.add(venta);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener el reporte de rentas: " + e.getMessage());
            throw new RuntimeException("Error al obtener reporte de ventas", e);
        }

        return listaReporte;
    }
}
