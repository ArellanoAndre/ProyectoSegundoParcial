/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.sql.Date;

/**
 *
 * @author aleja
 */
public class VentaReporte {

    private int idVenta;
    private Date fecha;
    private String cliente;
    private String producto;
    private String marca;
    private String modelo;
    private int cantidadVendida;
    private double precioUnitario;
    private double totalVenta;

    public VentaReporte() {
    }

    public VentaReporte(int idVenta, Date fecha, String cliente, String producto, String marca, String modelo, int cantidadVendida, double precioUnitario, double totalVenta) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.cliente = cliente;
        this.producto = producto;
        this.marca = marca;
        this.modelo = modelo;
        this.cantidadVendida = cantidadVendida;
        this.precioUnitario = precioUnitario;
        this.totalVenta = totalVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }
    
    
    
}
