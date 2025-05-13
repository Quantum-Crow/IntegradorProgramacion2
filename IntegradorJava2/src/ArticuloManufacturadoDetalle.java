public class ArticuloManufacturadoDetalle {
    private ArticuloManufacturado producto;
    private int cantidad;

    public ArticuloManufacturadoDetalle(ArticuloManufacturado producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public ArticuloManufacturado getProducto() {
        return producto;
    }

    public void setProducto(ArticuloManufacturado producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DetalleManufacturado[" + producto +
                ", cantidad=" + cantidad + "]";
    }
}
