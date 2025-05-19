public abstract class Articulo {
    private String denominacion;
    private double precioVenta;
    private UnidadMedida unidad;

    public Articulo(String denominacion, double precioVenta, UnidadMedida unidad) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.unidad = unidad;
    }

    public Articulo(String denominacion, UnidadMedida unidad) {
        this.denominacion = denominacion;
        this.unidad = unidad;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
}
