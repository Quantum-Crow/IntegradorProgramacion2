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

    public LocalTime getHoraEstimadaFinalizacion() {
        return horaEstimadaFinalizacion;
    }

    public void setHoraEstimadaFinalizacion(LocalTime horaEstimadaFinalizacion) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalCosto() {
        return totalCosto;
    }

    public void setTotalCosto(double totalCosto) {
        this.totalCosto = totalCosto;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallePedido> detalles) {
        this.detalles = detalles;
    }

    public Factura getFactura() {
        return factura;
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

    @Override
    public String toString() {
        return "Pedido{" +
                "horaEstimadaFinalizacion=" + horaEstimadaFinalizacion +
                ", total=" + total +
                ", totalCosto=" + totalCosto +
                ", estado=" + estado +
                ", tipoEnvio=" + tipoEnvio +
                ", formaPago=" + formaPago +
                ", fechaPedido=" + fechaPedido +
                ", cliente=" + cliente +
                ", sucursal=" + sucursal +
                ", detalles=" + detalles +
                ", factura=" + factura +
                '}';
    }
}
