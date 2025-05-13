import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String nombre;
    private LocalTime horarioApertura, horarioCierre;
    private Empresa empresa;
    private Domicilio domicilio;
    private List<Promocion> promociones = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();

    public Sucursal(String nombre, LocalTime apertura, LocalTime cierre, Domicilio dom) {
        this.nombre = nombre;
        this.horarioApertura = apertura;
        this.horarioCierre = cierre;
        this.domicilio = dom;
    }

    public void setEmpresa(Empresa emp) {
        this.empresa = emp;
    }
    public void addPromocion(Promocion p) {
        promociones.add(p);
        p.getSucursales().add(this);
    }
    public void addPedido(Pedido ped) {
        pedidos.add(ped);
        ped.setSucursal(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", horarioApertura=" + horarioApertura +
                ", horarioCierre=" + horarioCierre +
                ", empresa=" + empresa +
                ", domicilio=" + domicilio +
                ", promociones=" + promociones +
                ", pedidos=" + pedidos +
                '}';
    }

    // toString(), getters, setters...
}
