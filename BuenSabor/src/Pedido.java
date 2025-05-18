import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Pedido {
    private LocalTime horaEstimada;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate FechaPedido;
    private Factura factura;
    private Set<Domicilio> domicilioSet;
    private Set<Sucursal> sucursalSet;
    private Set<DetallePedido> detalles;

    public void addDetallePedido(DetallePedido detalle){
        if (detalles == null) {
            detalles = new HashSet<>();
        }
        detalles.add(detalle);
    }
}
