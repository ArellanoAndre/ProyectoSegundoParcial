
package Entidades;

/**
 *
 * @author aleja
 */
public class Producto {
    private int id;
    private String producto;
    private String marca;
    private String modelo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;

    // Constructor vacío
    public Producto() {}

    public Producto(String producto, String marca, String modelo, String descripcion, double precioCompra, double precioVenta) {
        this.producto = producto;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    // Constructor con parámetros
    public Producto(int id, String producto, String marca, String modelo, String descripcion, 
                    double precioCompra, double precioVenta) {
        this.id = id;
        this.producto = producto;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

   
}