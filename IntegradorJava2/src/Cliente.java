import java.time.LocalDate;
import java.util.HashSet;

public class Cliente {
    private String nombre, apellido, telefono, email;
    private LocalDate fechaNacimiento;

    private Usuario usuario;
    private Imagen2 imagen;
    private HashSet<Pedido> pedidos;

    public Cliente(String nombre, String apellido, String telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    public void addPedido (Pedido pedido){
        if(pedidos == null){
            pedidos = new HashSet<>();
        }
        this.pedidos.add(pedido);
    }
    public void removePedido (Pedido pedido){
        if(pedidos != null){
            this.pedidos.remove(pedido);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Imagen2 getImagen() {
        return imagen;
    }

    public void setImagen(Imagen2 imagen) {
        this.imagen = imagen;
    }

    public HashSet<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(HashSet<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", usuario=" + usuario +
                ", imagen=" + imagen +
                ", pedidos=" + pedidos +
                '}';
    }
}
