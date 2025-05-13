// Factura.java
import java.time.LocalDate;

public class Factura {
    private LocalDate fechaFacturacion;
    private int mpPaymentId;
    private int mpMerchantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private double totalVenta;
    private Pedido pedido;

    public Factura(LocalDate fechaFacturacion,
                   int mpPaymentId,
                   int mpMerchantOrderId,
                   String mpPreferenceId,
                   String mpPaymentType,
                   FormaPago formaPago,
                   double totalVenta) {
        this.fechaFacturacion = fechaFacturacion;
        this.mpPaymentId = mpPaymentId;
        this.mpMerchantOrderId = mpMerchantOrderId;
        this.mpPreferenceId = mpPreferenceId;
        this.mpPaymentType = mpPaymentType;
        this.formaPago = formaPago;
        this.totalVenta = totalVenta;
    }
    public void setPedido(Pedido p) { this.pedido = p; }

    @Override
    public String toString() {
        return "Factura[" + fechaFacturacion +
                ", mpPaymentId=" + mpPaymentId +
                ", mpOrderId=" + mpMerchantOrderId +
                ", prefId=" + mpPreferenceId +
                ", type=" + mpPaymentType +
                ", pago=" + formaPago +
                ", total=" + totalVenta + "]";
    }
}
