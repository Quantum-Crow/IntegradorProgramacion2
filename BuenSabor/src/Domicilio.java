public class Domicilio {
    private String nombre;
    private Integer numero;
    private Integer cp;
    private Localidad localidad;

    public Domicilio(String nombre, Integer numero, Integer cp, Localidad localidad) {
        this.nombre = nombre;
        this.numero = numero;
        this.cp = cp;
        this.localidad = localidad;
    }

    public Domicilio() {
    }
}
