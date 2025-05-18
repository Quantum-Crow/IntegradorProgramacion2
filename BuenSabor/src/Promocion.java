import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Promocion {
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private double precioPromocional;
    private TipoPromocion tipoPromocion;
    private Set<Articulo> articuloSet;
    private Set<Imagen> imagenSet;

    public Promocion(String denominacion, LocalDate fechaDesde, LocalDate fechaHasta, LocalTime horaDesde, LocalTime horaHasta, String descripcionDescuento, double precioPromocional, TipoPromocion tipoPromocion) {
        this.denominacion = denominacion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
        this.descripcionDescuento = descripcionDescuento;
        this.precioPromocional = precioPromocional;
        this.tipoPromocion = tipoPromocion;
    }

    public Promocion() {
    }

    public void addImagen(Imagen imagen){
        if (imagenSet == null) imagenSet = new HashSet<>();
        imagenSet.add(imagen);
    }

    public void addArticulo(Articulo articulo){
        if (articuloSet == null) articuloSet = new HashSet<>();
        articuloSet.add(articulo);
    }

}
