package modeloTest;


import modelo.Publicacion;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PublicacionTest {


    @Test
    public void test_sePuublicaUnAriticuloConPrecioX() {

        Publicacion publicacionACrear = new Publicacion("Bicicleta BMX", 1500, 1);

        assertEquals(1500.0, publicacionACrear.getPrecio());

    }

    @Test
    public void test_alComprarUnaPublicacionSuStockBajaEnUno() {

        Publicacion publicacionACrear = new Publicacion("Bicicleta BMX", 1500, 1);
        publicacionACrear.comprar();

        assertEquals(0.0, publicacionACrear.getStock());

    }
}
