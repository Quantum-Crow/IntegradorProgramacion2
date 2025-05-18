import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Localidad localidadSuc1 = new Localidad();
        Localidad localidadSuc2 = new Localidad();

        Domicilio domicilioSuc1 = new Domicilio("Necochea",14,5500,localidadSuc1);
        Domicilio domicilioSuc2 = new Domicilio("9 de Julio", 1500, 76,localidadSuc2);

        Categoria catSuc1 = new Categoria("Panificados");
        Categoria catSuc2 = new Categoria("Pizzeria");

        Sucursal sucursal1 = new Sucursal("Il Panino",LocalTime.of(9,00),LocalTime.of(17,00),domicilioSuc1, catSuc1);
        Sucursal sucursal2 = new Sucursal("Rincón de la Boca", LocalTime.of(13,00),LocalTime.of(00,00),domicilioSuc2, catSuc2);

        Empresa elBuenSabor = new Empresa("El buen sabor", "S.A",203534343,sucursal1);
        elBuenSabor.addSucursal(sucursal2);

        Promocion promocionPizzeria1 = new Promocion("Promo Muza & cerveza", LocalDate.of(2025,5,31), LocalDate.of(2025,6,15), LocalTime.of(22,00), LocalTime.of(23,00), "Pizza mozzarella y cerveza rubia", 7500, TipoPromocion.happyHour);
        Promocion promocionPizzeria2 = new Promocion("Promo Cala & Beer", LocalDate.of(2025,5,31), LocalDate.of(2025,6,15), LocalTime.of(22,00), LocalTime.of(23,00), "Calabresa y Heineken", 8500, TipoPromocion.happyHour);
        Promocion promocionPanaderia1 = new Promocion("Promo Desayuno", LocalDate.of(2025,5,21), LocalDate.of(2025,6,18), LocalTime.of(6,00), LocalTime.of(10,00), "Cafe con leche a elección más tortita a elección", 2500, TipoPromocion.promocion1);
        Promocion promocionPanaderia2 = new Promocion("Promo Merienda", LocalDate.of(2025,5,23), LocalDate.of(2025,6,2), LocalTime.of(17,00), LocalTime.of(19,00), "Cafe especialidad + porción de torta a elección", 4500, TipoPromocion.promocion2);

        Imagen imagenProm1 = new Imagen("Imagen muza y cerveza");
        Imagen imagenProm2 = new Imagen("Calabresa");
        Imagen imagenProm3 = new Imagen("Coffee");
        Imagen imagenProm4 = new Imagen("Afternoon");

        promocionPizzeria1.addImagen(imagenProm1);
        promocionPizzeria2.addImagen(imagenProm2);
        promocionPanaderia1.addImagen(imagenProm3);
        promocionPanaderia2.addImagen(imagenProm4);

        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();

        DetallePedido detallePedido1 = new DetallePedido();
        DetallePedido detallePedido2 = new DetallePedido();

        pedido1.addDetallePedido(detallePedido1);
        pedido2.addDetallePedido(detallePedido2);

        Factura factura1 = new Factura();
        Factura factura2 = new Factura();

        UnidadMedida mililitros = new UnidadMedida("Unidad para líquidos");
        UnidadMedida gramos = new UnidadMedida("Unidad Medida Sólidos");

        Articulo cerveza = new ArticuloManufacturado("Cerveza Rubia",3500,mililitros);
        Articulo cervezaArtesanal = new ArticuloManufacturado("Cerveza artesanal a elección",4500,mililitros);

        ArticuloInsumo cafeMolido = new ArticuloInsumo("Café molido torrado", gramos, 8000.0, 5, 10, true);
        ArticuloInsumo leche = new ArticuloInsumo("Leche entera", mililitros,2500.0, 20,50,true);
        ArticuloInsumo lecheAlmendras = new ArticuloInsumo("Leche Almendras", mililitros,4500,);
        ArticuloInsumo azucar = new ArticuloInsumo("Azucar blanca",gramos,1500.0, 10,15, true);
        ArticuloInsumo azucarMascabo = new ArticuloInsumo("Azucar Mascabo",gramos,3500.0, 5,8, true);
        ArticuloInsumo capsulasEspecialidad = new ArticuloInsumo("Capsulas especialidad importadas",gramos,10000.0,5,12, true);
        ArticuloInsumo harina = new ArticuloInsumo();
        ArticuloInsumo levadura = new ArticuloInsumo();
        ArticuloInsumo sal = new ArticuloInsumo();
        ArticuloInsumo grasa = new ArticuloInsumo();
        ArticuloInsumo salsa = new ArticuloInsumo();
        ArticuloInsumo condimentos = new ArticuloInsumo();
        ArticuloInsumo queso = new ArticuloInsumo();
        ArticuloInsumo salameCalabres = new ArticuloInsumo();

        ArticuloManufacturadoDetalle detalleCafe1 = new ArticuloManufacturadoDetalle(1, cafeMolido);
        ArticuloManufacturadoDetalle detalleCafe2 = new ArticuloManufacturadoDetalle(1,leche);
        ArticuloManufacturadoDetalle detalleCafe3 = new ArticuloManufacturadoDetalle(1,azucar);

        ArticuloManufacturadoDetalle detalleCafeEspecialidad1 = new ArticuloManufacturadoDetalle(1,capsulasEspecialidad);
        ArticuloManufacturadoDetalle detalleCafeEspecialidad2 = new ArticuloManufacturadoDetalle(1,lecheAlmendras);
        ArticuloManufacturadoDetalle detalleCafeEspecialidad3 = new ArticuloManufacturadoDetalle(1,azucarMascabo);

        ArticuloManufacturadoDetalle detalleMasa1 = new ArticuloManufacturadoDetalle(1,harina);
        ArticuloManufacturadoDetalle detalleMasa2 = new ArticuloManufacturadoDetalle(1, levadura);
        ArticuloManufacturadoDetalle detalleMasa3 = new ArticuloManufacturadoDetalle(1, sal);
        ArticuloManufacturadoDetalle detalleTortita1 = new ArticuloManufacturadoDetalle(1, grasa);

        ArticuloManufacturadoDetalle detallePizza1 = new ArticuloManufacturadoDetalle(1, salsa);
        ArticuloManufacturadoDetalle detallePizza2 = new ArticuloManufacturadoDetalle(1, queso);
        ArticuloManufacturadoDetalle detallePizza3 = new ArticuloManufacturadoDetalle(1, condimentos);
        ArticuloManufacturadoDetalle detallePizza4 = new ArticuloManufacturadoDetalle(1, salameCalabres);

        ArticuloManufacturado cafeVenta = new ArticuloManufacturado();
        cafeVenta.addDetalle(detalleCafe1);
        cafeVenta.addDetalle(detalleCafe2);
        cafeVenta.addDetalle(detalleCafe3);

        ArticuloManufacturado cafeEspecialidad = new ArticuloManufacturado();
        cafeEspecialidad.addDetalle(detalleCafeEspecialidad1);
        cafeEspecialidad.addDetalle(detalleCafeEspecialidad2);
        cafeEspecialidad.addDetalle(detalleCafeEspecialidad3);

        ArticuloManufacturado tortita = new ArticuloManufacturado();
        tortita.addDetalle(detalleTortita1);
        tortita.addDetalle(detalleMasa1);
        tortita.addDetalle(detalleMasa2);
        tortita.addDetalle(detalleMasa3);

        ArticuloManufacturado pizzaMozzarella = new ArticuloManufacturado();
        pizzaMozzarella.addDetalle(detalleMasa1);
        pizzaMozzarella.addDetalle(detalleMasa2);
        pizzaMozzarella.addDetalle(detalleMasa3);
        pizzaMozzarella.addDetalle(detallePizza1);
        pizzaMozzarella.addDetalle(detallePizza2);
        pizzaMozzarella.addDetalle(detallePizza3);

        ArticuloManufacturado pizzaCalabresa = pizzaMozzarella;
        pizzaCalabresa.addDetalle(detallePizza4);

        promocionPanaderia1.addArticulo(cafeVenta);
        promocionPanaderia1.addArticulo(tortita);

        promocionPanaderia2.addArticulo(cafeEspecialidad);
        promocionPanaderia2.addArticulo(tortita);

        promocionPizzeria1.addArticulo(pizzaMozzarella);
        promocionPizzeria1.addArticulo(cerveza);

        promocionPizzeria2.addArticulo(pizzaCalabresa);
        promocionPizzeria2.addArticulo(cervezaArtesanal);
    }
}