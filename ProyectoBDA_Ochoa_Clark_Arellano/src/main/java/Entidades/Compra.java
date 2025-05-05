/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.sql.Date;

/**
 *
 * @author Arell
 */
public class Compra {
    
    private int id;
    private int productoId;
    private int adminId;
    private int cantidad;
    private double precioUnitario;
    private Date fecha;
    
    // Constructor
    public Compra(int productoId, int adminId, int cantidad, double precioUnitario) {
        this.productoId = productoId;
        this.adminId = adminId;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
//        this.fecha = new Date(); // Fecha actual por defecto
    }
    
    // Getters y Setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getProductoId() {
        return productoId;
    }
    
    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }
    
    public int getAdminId() {
        return adminId;
    }
    
    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    // Método para calcular el total
    public double getTotal() {
        return cantidad * precioUnitario;
    }

    
}
