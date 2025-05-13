// Cliente.java
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre, apellido, telefono, email;
    private LocalDate fechaNacimiento;
    private List<Pedido> pedidos = new ArrayList<>();

    public Cliente(String nombre, String apellido,
                   String telefono, String email,
                   LocalDate fnac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fnac;
    }
    public void addPedido(Pedido p) {
        pedidos.add(p);
        p.setCliente(this);
    }

    @Override
    public String toString() {
        return "Cliente[" + nombre + " " + apellido +
                ", " + telefono + ", " + email +
                ", naci=" + fechaNacimiento + "]";
    }
}
