// Imagen.java
public class Imagen {
    private String denominacion;

    public Imagen(String denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return "Imagen[" + denominacion + "]";
    }
}
