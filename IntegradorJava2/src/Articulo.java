import java.util.HashSet;

public abstract class Articulo {
    protected String denominacion;
    protected double precioVenta;

    protected UnidadMedida unidadMedida;
    protected HashSet<Imagen1> Imagen;

    public Articulo(String denominacion, double precioVenta) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
    }

    public Articulo(String denominacion, double precioVenta, UnidadMedida unidadMedida) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.unidadMedida = unidadMedida;
    }

    public void addImagen(Imagen1 imagen) {
        if (Imagen == null) {
            Imagen = new HashSet<>();
        }
        this.Imagen.add(imagen);
    }

    public void removeImagen(Imagen1 imagen) {
        if (Imagen != null) {
            this.Imagen.remove(imagen);
        }
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

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
}
