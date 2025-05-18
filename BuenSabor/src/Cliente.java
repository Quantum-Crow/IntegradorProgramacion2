import java.time.LocalDate;
import java.util.Set;

public class Cliente {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    private Imagen imagen;
    private Set<Domicilio> domicilioSet;
    private Usuario usuario;
    private Set<Pedido> pedidoSet;
}
