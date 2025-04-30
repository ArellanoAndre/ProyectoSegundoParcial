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
public class Venta {

    private int id;
    private Date fecha;  // Usando java.util.Date para la fecha
    private int usuarioId;  // ID del cliente
    private double total;  // Total de la venta

    public Venta() {
    }

    public Venta(int id, Date fecha, int usuarioId, double total) {
        this.id = id;
        this.fecha = fecha;
        this.usuarioId = usuarioId;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
