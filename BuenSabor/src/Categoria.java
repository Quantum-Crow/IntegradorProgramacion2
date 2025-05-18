import java.util.HashSet;
import java.util.Set;

public class Categoria {
    private String denominacion;
    private Set<Articulo> articuloSet;

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
        this.articuloSet = new HashSet<>();
    }

    public void addArticulo(Articulo articulo){
        articuloSet.add(articulo);
    }
}
