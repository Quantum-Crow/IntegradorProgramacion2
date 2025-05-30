import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // 1) Países
        Pais p1 = new Pais("Argentina");
        Pais p2 = new Pais("Chile");

        // 2) Provincias
        Provincia pr1 = new Provincia("Mendoza");
        pr1.setPais(p1);
        Provincia pr2 = new Provincia("Valparaiso?");
        pr2.setPais(p2);

        // 3) Localidades
        Localidad l1 = new Localidad("Villa Nueva");
        l1.setProvincia(pr1);
        Localidad l2 = new Localidad("Que se yo, algun lugar de Chile");
        l2.setProvincia(pr2);

        // 4) Domicilios
        Domicilio d1 = new Domicilio("Calle 1", 123, 1900);
        d1.setLocalidad(l1);
        Domicilio d2 = new Domicilio("Rua 2", 456, 13000);
        d2.setLocalidad(l2);

        // 5) Sucursales
        Sucursal s1 = new Sucursal("Sucursal Centro",
                LocalTime.of(9,0), LocalTime.of(18,0), d1);
        Sucursal s2 = new Sucursal("Sucursal Norte",
                LocalTime.of(10,0), LocalTime.of(20,0), d2);

        // 6) Empresa
        Empresa e1 = new Empresa("Foo S.A.", "Foo Sociedad Anónima", 201234567);
        Empresa e2 = new Empresa("Bar Ltda.", "Bar Limitada", 301234568);

        //7) Promociones
        Promocion promo1 = new Promocion(
                "Happy Hour", LocalDate.now(),
                LocalDate.now().plusDays(7),
                LocalTime.of(17,0), LocalTime.of(19,0),
                "50% off", 100.0, TipoPromocion.happyHour
        );
        Promocion promo2 = new Promocion(
                "Promo 1", LocalDate.now(),
                LocalDate.now().plusDays(3),
                LocalTime.of(12,0), LocalTime.of(14,0),
                "30% off", 150.0, TipoPromocion.promocion_1
        );

        //8) Imágenes
        Imagen1 img1 = new Imagen1("Imagen 1");
        Imagen2 img2 = new Imagen2("Imagen 2");

        // 9) Categorías
        Categoria cat1 = new Categoria("Pizzeria");
        Categoria cat2 = new Categoria("Panificados");

        // 9.1) Subcategorias
        Categoria subCat1 = new Categoria("Pizza Mozzarella");
        Categoria subCat2 = new Categoria("Pizza 4 Quesos");
        Categoria subCat3 = new Categoria("Galletas");
        Categoria subCat4 = new Categoria("Bizcochos");

        // 9.2) Relacion padre e hijo
        cat1.addSubcategoria(subCat1);
        cat1.addSubcategoria(subCat2);
        cat2.addSubcategoria(subCat3);
        cat2.addSubcategoria(subCat4);

        // 10) Unidades de medida
        UnidadMedida mililitros = new UnidadMedida("Mililitros");
        UnidadMedida gramos = new UnidadMedida("Gramos");
        UnidadMedida unidad = new UnidadMedida("Unidad");

        //11) Insumos
        ArticuloInsumo harina = new ArticuloInsumo("Harina 000", 49.99, gramos, 20.0);
        ArticuloInsumo levadura = new ArticuloInsumo("Levadura", 9.99, gramos, 5.0);

        //12) Manufacturados
        ArticuloManufacturado am1 = new ArticuloManufacturado("Pizza Mozzarela", 15, unidad, "Pizza Mozzarella comun y corriente" );
        ArticuloManufacturado am2 = new ArticuloManufacturado("Bizcocho", 20, unidad ,"Hornear");

        //13) Detalle Manufacturado
        ArticuloManufacturadoDetalle amd1 = new ArticuloManufacturadoDetalle( 10, harina);
        ArticuloManufacturadoDetalle amd2 = new ArticuloManufacturadoDetalle(5, harina);

        //14) Clientes
        Cliente cl1 = new Cliente("Ana", "García", "111-222", "ana@mail.com");
        Cliente cl2 = new Cliente("Gerardo", "Buster", "333-444", "bruno@mail.br");

        //15) Usuarios
        Usuario cliente1 = new Usuario("auth0|123", "ana_g", Rol.cliente);
        Usuario cliente2 = new Usuario("auth0|456", "gerardo_b", Rol.cliente);
        Usuario empleado1 = new Usuario("auth0|789", "bruno_s", Rol.empleado);

        //16) Detalles de pedidos
        DetallePedido detallePedido1 = new DetallePedido(2, am1);
        DetallePedido detallePedido2 = new DetallePedido(12, am2);

        //17) Pedidos
        LocalTime horafin1 = LocalTime.of(04, 26);
        LocalDate fechapedido1 = LocalDate.of(2025, 5, 23);
        Pedido pedido1 = new Pedido(Estado.pendiente, TipoEnvio.TakeAway, FormaPago.MercadoPago, fechapedido1, s1, d1);
        pedido1.addDetallePedido(detallePedido1);
        pedido1.setHoraEstimadaFinalizacion(horafin1);

        LocalTime horafin2 = LocalTime.of(04, 26);
        LocalDate fechapedido2 = LocalDate.of(2025, 5, 23);
        Pedido pedido2 = new Pedido(Estado.pendiente, TipoEnvio.delivery, FormaPago.efectivo, fechapedido2, s2, d2);
        pedido2.addDetallePedido(detallePedido2);
        pedido2.setHoraEstimadaFinalizacion(horafin2);

        //18) Facturas
        Factura factura1 = new Factura(pedido1.getFechaPedido(),8500,FormaPago.MercadoPago);
        Factura factura2 = new Factura(pedido2.getFechaPedido(), 4000,  FormaPago.efectivo);

        //Souts para que se ordene mejor
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(pr1);
        System.out.println(pr2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(promo1);
        System.out.println(promo2);
        System.out.println(img1);
        System.out.println(img2);
        System.out.println(mililitros);
        System.out.println(gramos);
        System.out.println(unidad);
        System.out.println(harina);
        System.out.println(levadura);
        System.out.println(am1);
        System.out.println(am2);
        System.out.println(amd1);
        System.out.println(amd2);
        System.out.println(cl1);
        System.out.println(cl2);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(empleado1);
        System.out.println(detallePedido1);
        System.out.println(detallePedido2);
        System.out.println(pedido1);
        System.out.println(pedido2);
        System.out.println(factura1);
        System.out.println(factura2);
    }
}