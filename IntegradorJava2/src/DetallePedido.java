public class DetallePedido {
    private int cantidad;
    private double subTotal;
    private Pedido pedido;
    private Articulo articulo;

    public DetallePedido(int cantidad, double subTotal) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setPedido(Pedido p) { this.pedido = p; }
    public void setArticulo(Articulo a) { this.articulo = a; }

    @Override
    public String toString() {
        return "DetallePedido[cant=" + cantidad + ", sub=" + subTotal + "]";
    }
}
