import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1) Países
        Pais p1 = new Pais("Argentina");
        Pais p2 = new Pais("Brasil");

        // 2) Provincias
        Provincia pr1 = new Provincia("Buenos Aires", p1);
        Provincia pr2 = new Provincia("Sao Paulo", p2);

        // 3) Localidades
        Localidad l1 = new Localidad("La Plata", pr1);
        Localidad l2 = new Localidad("Que se yo", pr2);

        // 4) Domicilios
        Domicilio d1 = new Domicilio("Calle 1", 123, 1900, l1);
        Domicilio d2 = new Domicilio("Rua 2", 456, 13000, l2);

        // 5) Empresas
        Empresa e1 = new Empresa("Foo S.A.", "Foo Sociedad Anónima", 201234567);
        Empresa e2 = new Empresa("Bar Ltda.", "Bar Limitada", 301234568);

        // 6) Sucursales
        Sucursal s1 = new Sucursal("Sucursal Centro",
                LocalTime.of(9,0), LocalTime.of(18,0), d1);
        Sucursal s2 = new Sucursal("Sucursal Norte",
                LocalTime.of(10,0), LocalTime.of(20,0), d2);

         
        //7) Promociones
        Promocion promo1 = new Promocion(
                "Happy Hour", LocalDate.now(),
                LocalDate.now().plusDays(7),
                LocalTime.of(17,0), LocalTime.of(19,0),
                "50% off", 100.0, TipoPromocion.HAPPY_HOUR
        );
        Promocion promo2 = new Promocion(
                "Promo 1", LocalDate.now(),
                LocalDate.now().plusDays(3),
                LocalTime.of(12,0), LocalTime.of(14,0),
                "30% off", 150.0, TipoPromocion.PROMOCION_1
        );


        //8) Imágenes
        Imagen img1 = new Imagen("Imagen 1");
        Imagen img2 = new Imagen("Imagen 2");



        // 9) Categorías
        Categoria c1 = new Categoria("Bebidas");
        Categoria c2 = new Categoria("Comidas");
        Categoria insumo = new Categoria("insumo");

        //10) Unidades de medida
        UnidadMedida u1 = new UnidadMedida("Litro");
        UnidadMedida u2 = new UnidadMedida("Kilogramo");

        //11) Artículos
       /* Articulo a1 = new Articulo("Agua", 10.0);
        Articulo a2 = new Articulo("Carne", 250.0);*/

        //12) Insumos
        ArticuloInsumo ai1 = new ArticuloInsumo("Harina", 5.0, insumo , u2 ,100, 200, 200, true);
        ArticuloInsumo ai2 = new ArticuloInsumo("Aceite", 50, insumo, u1,100, 300, 500 ,true);

        //13) Manufacturados
        ArticuloManufacturado am1 = new ArticuloManufacturado("Empanada", 15, 10,"Hornear");
        ArticuloManufacturado am2 = new ArticuloManufacturado("Pizza", 20, 20,"Hornear");

        //14) Detalle Manufacturado
        ArticuloManufacturadoDetalle amd1 = new ArticuloManufacturadoDetalle(am1, 10);
        ArticuloManufacturadoDetalle amd2 = new ArticuloManufacturadoDetalle(am2, 5);

        //15) Clientes
        Cliente cl1 = new Cliente("Ana", "García", "111-222", "ana@mail.com", LocalDate.of(1990,1,1));
        Cliente cl2 = new Cliente("Bruno", "Silva", "333-444", "bruno@mail.br", LocalDate.of(1985,5,15));

        //16) Usuarios
        Usuario u_1 = new Usuario("auth0|123", "ana_g", Rol.CLIENTE);
        Usuario u_2 = new Usuario("auth0|456", "bruno_s", Rol.EMPLEADO);

        //17) Detalles de Pedido
        DetallePedido dp1 = new DetallePedido(2, 20.0);
        DetallePedido dp2 = new DetallePedido(1, 250.0);


        //18) Pedidos
        Pedido pd1 = new Pedido(
                LocalTime.of(14,30), 20.0, 15.0,
                Estado.PENDIENTE, TipoEnvio.DELIVERY,
                FormaPago.EFECTIVO, LocalDate.now(),
                Arrays.asList(dp1)
        );

        Pedido pd2 = new Pedido(
                LocalTime.of(19,0), 250.0, 200.0,
                Estado.ENTREGADO, TipoEnvio.TAKEAWAY,
                FormaPago.MERCADO_PAGO, LocalDate.now(),
                Arrays.asList(dp2)
        );



        //19) Facturas
        Factura f1 = new Factura(LocalDate.now(), 1111, 2222, "pref1", "ticket", FormaPago.EFECTIVO, 20.0);
        Factura f2 = new Factura(LocalDate.now(), 3333, 4444, "pref2", "ticket", FormaPago.MERCADO_PAGO, 250.0);

        // Imprimimos todo, porque tengo tiempo
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(pr1);
        System.out.println(pr2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(promo1);
        System.out.println(promo2);
        System.out.println(img1);
        System.out.println(img2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(u1);
        System.out.println(u2);
        /*
        System.out.println(a1);
        System.out.println(a2);
         */
        System.out.println(ai1);
        System.out.println(ai2);
        System.out.println(am1);
        System.out.println(am2);
        System.out.println(amd1);
        System.out.println(amd2);
        System.out.println(cl1);
        System.out.println(cl2);
        System.out.println(u_1);
        System.out.println(u_2);
        System.out.println(dp1);
        System.out.println(dp2);

        System.out.println(pd1);
        System.out.println(pd2);

        System.out.println(f1);
        System.out.println(f2);
    }
}

