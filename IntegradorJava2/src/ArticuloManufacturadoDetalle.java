import java.util.ArrayList;
public class ArticuloManufacturadoDetalle {
    private ArticuloManufacturado producto;
    private int cantidad;

    public ArticuloManufacturadoDetalle(ArticuloManufacturado producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DetalleManufacturado[" + producto +
                ", cantidad=" + cantidad + "]";
    }
}
