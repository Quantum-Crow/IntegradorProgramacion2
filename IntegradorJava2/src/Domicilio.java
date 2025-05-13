// Domicilio.java
public class Domicilio {
    private String calle;
    private int numero;
    private int cp;
    private Localidad localidad;

    public Domicilio(String calle, int numero, int cp, Localidad localidad) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.localidad = localidad;
    }

    // getters/setters omitted for brevity

    @Override
    public String toString() {
        return "Domicilio[" + calle + " " + numero + ", CP=" + cp
                + ", " + localidad + "]";
    }
}
