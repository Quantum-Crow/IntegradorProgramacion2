import java.util.ArrayList;
import java.util.List;

// Articulo.java
public class Articulo {
    protected String denominacion;
    protected double precioVenta;

    // asociaciones
    protected Categoria categoria;
    protected UnidadMedida unidadMedida;
    protected List<Imagen> imagenes = new ArrayList<>();
    protected List<DetallePedido> detallesPedido = new ArrayList<>();


    public Articulo(String denominacion, double precioVenta) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public List<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    public List<DetallePedido> getDetallesPedido() {
        return detallesPedido;
    }

    public void setDetallesPedido(List<DetallePedido> detallesPedido) {
        this.detallesPedido = detallesPedido;
    }

    // getters, setters, toString()...

    @Override
    public String toString() {
        return "Articulo[" + denominacion + ", precio=" + precioVenta + "]";
    }
    // getters, setters
}
