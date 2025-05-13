import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalTime horaEstimadaFinalizacion;
    private double total, totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;

    private Cliente cliente;
    private Sucursal sucursal;
    private List<DetallePedido> detalles = new ArrayList<>();
    private Factura factura;

    public Pedido(LocalTime he, double total, double costo,
                  Estado estado, TipoEnvio te,
                  FormaPago fp, LocalDate fecha,
                  List<DetallePedido> detalles) {
        this.horaEstimadaFinalizacion = he;
        this.total = total;
        this.totalCosto = costo;
        this.estado = estado;
        this.tipoEnvio = te;
        this.formaPago = fp;
        this.fechaPedido = fecha;
        this.detalles = detalles;
    }



    public void setCliente(Cliente cli) {
        this.cliente = cli;
    }
    public void setSucursal(Sucursal suc) {
        this.sucursal = suc;
    }

    public void addDetalle(DetallePedido dp) {
        detalles.add(dp);
        dp.setPedido(this);
    }

    public void setFactura(Factura f) {
        this.factura = f;
        f.setPedido(this);
    }
    // toString(), getters, setters...
}
