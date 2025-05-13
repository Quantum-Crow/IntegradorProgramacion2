public class Categoria {
    private String denominacion;

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return "Categoria[" + denominacion + "]";
    }
}
