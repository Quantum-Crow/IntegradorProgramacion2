import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private String nombre;
    private LocalTime horaApertura;
    private LocalTime horaCierre;
    private Domicilio domicilio;
    private Set<Categoria> categoriaSet;
    private Set<Promocion> promocionSet;


    public Sucursal(String nombre, LocalTime horaApertura, LocalTime horaCierre, Domicilio domicilio, Categoria categoria) {
        this.nombre = nombre;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.domicilio = domicilio;
        this.addCategoria(categoria);
    }

    public void addCategoria(Categoria categoria){
        if (categoriaSet == null) categoriaSet = new HashSet<>();
        categoriaSet.add(categoria);
    }

    public void addPromocion(Promocion promocion){
        if (promocionSet == null) promocionSet = new HashSet<>();
        promocionSet.add(promocion);
    }
}
