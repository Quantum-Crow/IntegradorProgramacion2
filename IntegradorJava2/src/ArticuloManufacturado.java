import java.util.HashSet;
import java.util.Set;

public class ArticuloManufacturado extends Articulo {
    private String descripcion, preparacion;
    private Integer tiempoEstimadoMinutos;
    private Set<ArticuloManufacturadoDetalle> ArtManDet;

    public ArticuloManufacturado(String denominacion, double precioVenta, UnidadMedida unidadMedida, String descripcion) {
        super(denominacion, precioVenta, unidadMedida);
        this.descripcion = descripcion;
    }
    public void addDetalle(ArticuloManufacturadoDetalle det) {
        if (this.ArtManDet == null) {
            this.ArtManDet = new HashSet<ArticuloManufacturadoDetalle>();
        }
        this.ArtManDet.add(det);
    }
    public void removeDetalle(ArticuloManufacturadoDetalle det) {
        this.ArtManDet.remove(det);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public Integer getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(Integer tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public Set<ArticuloManufacturadoDetalle> getArtManDet() {
        return ArtManDet;
    }

    public void setArtManDet(Set<ArticuloManufacturadoDetalle> artManDet) {
        ArtManDet = artManDet;
    }

    @Override
    public String toString() {
        return "ArticuloManufacturado{" +
                "descripcion='" + descripcion + '\'' +
                ", preparacion='" + preparacion + '\'' +
                ", tiempoEstimadoMinutos=" + tiempoEstimadoMinutos +
                ", ArtManDet=" + ArtManDet +
                ", Imagen=" + Imagen +
                ", unidadMedida=" + unidadMedida +
                ", precioVenta=" + precioVenta +
                ", denominacion='" + denominacion + '\'' +
                '}';
    }
}
