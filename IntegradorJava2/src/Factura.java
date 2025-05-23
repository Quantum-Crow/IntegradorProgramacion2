import java.time.LocalDate;

public class Factura {
    private LocalDate fechaFacturacion;
    private Integer mpPaymentId, mpMerchantOrderId;
    private String mpPreferenceId, mpPaymentType;
    private FormaPago formaPago;
    private double totalVenta;

    public Factura(LocalDate fechaFacturacion, double totalVenta, FormaPago formaPago) {
        this.fechaFacturacion = fechaFacturacion;
        this.totalVenta = totalVenta;
        this.formaPago = formaPago;
    }

    public LocalDate getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(LocalDate fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public Integer getMpPaymentId() {
        return mpPaymentId;
    }

    public void setMpPaymentId(Integer mpPaymentId) {
        this.mpPaymentId = mpPaymentId;
    }

    public Integer getMpMerchantOrderId() {
        return mpMerchantOrderId;
    }

    public void setMpMerchantOrderId(Integer mpMerchantOrderId) {
        this.mpMerchantOrderId = mpMerchantOrderId;
    }

    public String getMpPreferenceId() {
        return mpPreferenceId;
    }

    public void setMpPreferenceId(String mpPreferenceId) {
        this.mpPreferenceId = mpPreferenceId;
    }

    public String getMpPaymentType() {
        return mpPaymentType;
    }

    public void setMpPaymentType(String mpPaymentType) {
        this.mpPaymentType = mpPaymentType;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "fechaFacturacion=" + fechaFacturacion +
                ", mpPaymentId=" + mpPaymentId +
                ", mpMerchantOrderId=" + mpMerchantOrderId +
                ", mpPreferenceId='" + mpPreferenceId + '\'' +
                ", mpPaymentType='" + mpPaymentType + '\'' +
                ", formaPago=" + formaPago +
                ", totalVenta=" + totalVenta +
                '}';
    }
}
