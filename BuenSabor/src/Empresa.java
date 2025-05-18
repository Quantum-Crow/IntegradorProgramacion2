import java.util.HashSet;
import java.util.Set;

public class Empresa {
    private String nombre;
    private String razonSocial;
    private Integer cuil;
    private Set<Sucursal> sucursalSet;

    public Empresa(String nombre, String razonSocial, Integer cuil, Sucursal sucursal){
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = cuil;
        this.addSucursal(sucursal);
    }

    public void addSucursal(Sucursal sucursal){
        if (sucursalSet==null) sucursalSet = new HashSet<>();
        sucursalSet.add(sucursal);
    }
}
