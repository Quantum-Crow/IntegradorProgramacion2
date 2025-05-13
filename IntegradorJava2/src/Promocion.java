import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Promocion {
    private String denominacion;
    private LocalDate fechaDesde, fechaHasta;
    private LocalTime horaDesde, horaHasta;
    private String descripcionDescuento;
    private double precioPromocional;

    private TipoPromocion tipo;
    private List<Sucursal> sucursales = new ArrayList<>();

    public Promocion(String denominacion,
                     LocalDate fd, LocalDate fh,
                     LocalTime hd, LocalTime hh,
                     String desc, double precio,
                     TipoPromocion tipo) {
        this.denominacion = denominacion;
        this.fechaDesde = fd;
        this.fechaHasta = fh;
        this.horaDesde = hd;
        this.horaHasta = hh;
        this.descripcionDescuento = desc;
        this.precioPromocional = precio;
        this.tipo = tipo;
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    @Override
    public String toString() {
        return "Promocion{" +
                "denominacion='" + denominacion + '\'' +
                ", fechaDesde=" + fechaDesde +
                ", fechaHasta=" + fechaHasta +
                ", horaDesde=" + horaDesde +
                ", horaHasta=" + horaHasta +
                ", descripcionDescuento='" + descripcionDescuento + '\'' +
                ", precioPromocional=" + precioPromocional +
                ", tipo=" + tipo +
                ", sucursales=" + sucursales +
                '}';
    }
}
