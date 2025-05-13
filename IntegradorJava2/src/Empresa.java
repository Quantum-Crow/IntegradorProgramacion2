import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String razonSocial;
    private int cuil;
    private List<Sucursal> sucursales = new ArrayList<>();

    public Empresa(String nombre, String razonSocial, int cuil) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = cuil;
    }

    public void addSucursal(Sucursal s) {
        sucursales.add(s);
        s.setEmpresa(this);
    }

    //Hacer getters y setters

    @Override
    public String toString() {
        return "Empresa[" + nombre + ", " + razonSocial + ", CUIL=" + cuil + "]";
    }
}
