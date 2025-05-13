import java.util.ArrayList;
import java.util.List;

// ArticuloManufacturado.java
// ArticuloManufacturado.java
public class ArticuloManufacturado extends Articulo {
    private int tiempoEstimadoMinutos;
    private String preparacion;
    // asociación a detalles
    private List<ArticuloManufacturadoDetalle> detalles = new ArrayList<>();

    public ArticuloManufacturado(String denominacion,
                                 double precioVenta,
                                 //Categoria categoria,
                                 //UnidadMedida unidadMedida,
                                 int tiempoEstimadoMinutos,
                                 String preparacion) {
        super(denominacion, precioVenta);//, categoria, unidadMedida);
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
    }

    @Override
    public String toString() {
        return "Manufacturado[" + detalles +
                ", tiempo=" + tiempoEstimadoMinutos +
                " min, prep=" + preparacion + "]";
    }
    // toString(), getters, setters...
}

