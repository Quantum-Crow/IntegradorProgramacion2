public class ArticuloInsumo extends Articulo{
    private double PrecioCompra;
    private Integer stockActual, stockMaximo;
    private Boolean esParaElaborar;

    public ArticuloInsumo(String denominacion, double precioVenta, UnidadMedida unidadMedida, double precioCompra) {
        super(denominacion, precioVenta, unidadMedida);
        PrecioCompra = precioCompra;
    }

    public double getPrecioCompra() {
        return PrecioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        PrecioCompra = precioCompra;
    }

    public Integer getStockActual() {
        return stockActual;
    }

    public void setStockActual(Integer stockActual) {
        this.stockActual = stockActual;
    }

    public Integer getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(Integer stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public Boolean getEsParaElaborar() {
        return esParaElaborar;
    }

    public void setEsParaElaborar(Boolean esParaElaborar) {
        this.esParaElaborar = esParaElaborar;
    }

    @Override
    public String toString() {
        return "ArticuloInsumo{" +
                "esParaElaborar=" + esParaElaborar +
                ", PrecioCompra=" + PrecioCompra +
                ", stockActual=" + stockActual +
                ", stockMaximo=" + stockMaximo +
                ", Imagen=" + Imagen +
                ", denominacion='" + denominacion + '\'' +
                ", precioVenta=" + precioVenta +
                ", unidadMedida=" + unidadMedida +
                '}';
    }
}
