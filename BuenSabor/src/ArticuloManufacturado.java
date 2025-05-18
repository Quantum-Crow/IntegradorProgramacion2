import java.util.HashSet;
import java.util.Set;

public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalleSet;

    public ArticuloManufacturado(String denominacion, double precioVenta, UnidadMedida unidad) {
        super(denominacion, precioVenta, unidad);
    }

    public ArticuloManufacturado(String denominacion, double precioVenta, UnidadMedida unidad, String descripcion, Integer tiempoEstimadoMinutos, String preparacion) {
        super(denominacion, precioVenta, unidad);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
        this.articuloManufacturadoDetalleSet = new HashSet<>();
    }


    public void addDetalle(ArticuloManufacturadoDetalle detalle){
        articuloManufacturadoDetalleSet.add(detalle);
    }
}
