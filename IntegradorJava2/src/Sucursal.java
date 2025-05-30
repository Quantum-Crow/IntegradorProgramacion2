import java.time.LocalTime;
import java.util.HashSet;

public class Sucursal {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;

    //asociaciones
    private Domicilio domicilio;
    private HashSet<Categoria> categoria;
    private HashSet<Promocion> promocion;

    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre, Domicilio domicilio) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.domicilio = domicilio;
    }

    public void addPromocion(Promocion promocion) {
        if (this.promocion == null) {
            this.promocion = new HashSet<>();
        }
        this.promocion.add(promocion);
    }

    public void removePromocion(Promocion promocion) {
        if(this.promocion != null) {
            this.promocion.remove(promocion);
        }
    }

    public void addCategoria(Categoria categoria) {
        if (this.categoria == null) {
            this.categoria = new HashSet<>();
        }
        this.categoria.add(categoria);
    }

    public void removeCategoria(Categoria categoria) {
        if (this.categoria != null) {
            this.categoria.remove(categoria);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public HashSet<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(HashSet<Categoria> categoria) {
        this.categoria = categoria;
    }

    public HashSet<Promocion> getPromocion() {
        return promocion;
    }

    public void setPromocion(HashSet<Promocion> promocion) {
        this.promocion = promocion;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", horarioApertura=" + horarioApertura +
                ", horarioCierre=" + horarioCierre +
                ", domicilio=" + domicilio +
                ", categoria=" + categoria +
                ", promocion=" + promocion +
                '}';
    }
}
