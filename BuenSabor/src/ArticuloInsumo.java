public class ArticuloInsumo extends Articulo {
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

    public ArticuloInsumo(String denominacion, UnidadMedida unidad, Double precioCompra, Integer stockActual, Integer stockMaximo, Boolean esParaElaborar) {
        super(denominacion, unidad);
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
    }
}
