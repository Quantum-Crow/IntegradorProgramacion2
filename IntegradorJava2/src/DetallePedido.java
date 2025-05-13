// DetallePedido.java
public class DetallePedido {
    private int cantidad;
    private double subTotal;
    private Pedido pedido;
    private Articulo articulo;

    public DetallePedido(int cantidad, double subTotal) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public void setPedido(Pedido p) { this.pedido = p; }
    public void setArticulo(Articulo a) { this.articulo = a; }

    @Override
    public String toString() {
        return "DetallePedido[cant=" + cantidad + ", sub=" + subTotal + "]";
    }
}
