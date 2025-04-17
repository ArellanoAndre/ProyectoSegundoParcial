
package Entidades;
/**
 *
 * @author aleja
 */
public class Usuario {
    public Long id;
    public String NombreCompleto;
    public String NombreUsuario; 
    public String direccion;
    public String correo;
    public String contraseña;
    public Rol rol;

    public Usuario(Long id, String NombreCompleto, String NombreUsuario, String direccion, String correo, String contraseña, Rol rol) {
        this.id = id;
        this.NombreCompleto = NombreCompleto;
        this.NombreUsuario = NombreUsuario;
        this.direccion = direccion;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public Usuario(String NombreCompleto, String NombreUsuario, String direccion, String correo, String contraseña, Rol rol) {
        this.NombreCompleto = NombreCompleto;
        this.NombreUsuario = NombreUsuario;
        this.direccion = direccion;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public Usuario(String NombreUsuario, String contraseña) {
        this.NombreUsuario = NombreUsuario;
        this.contraseña = contraseña;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    
}


   
