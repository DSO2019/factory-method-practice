package mx.iteso;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import mx.iteso.Cone;
import mx.iteso.stores.WaterIceCreamStore;

public class WaterIceCreamStoreTest {
    @Test
    public void waterIceCreamStoreGuavaTest() {
        Cone cone = new WaterIceCreamStore().prepareCone("Guava");
        assertEquals(cone.getIceCream().getFlavor(), "Agua -> Guayaba");
    }

    @Test
    public void waterIceCreamStoreMangoTest() {
        Cone cone = new WaterIceCreamStore().prepareCone("Mango");
        assertEquals(cone.getIceCream().getFlavor(), "Agua -> Mango");
    }

    @Test
    public void waterIceCreamStorePineappleTest() {
        Cone cone = new WaterIceCreamStore().prepareCone("Pineapple");
        assertEquals(cone.getIceCream().getFlavor(), "Agua -> Piña");
    }

    @Test
    public void waterIceCreamStoreStrawberryTest() {
        Cone cone = new WaterIceCreamStore().prepareCone("Strawberry");
        assertEquals(cone.getIceCream().getFlavor(), "Agua -> Fresa");
    }
}