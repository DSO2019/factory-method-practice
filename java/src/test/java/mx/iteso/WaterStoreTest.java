package mx.iteso;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import mx.iteso.factory.Cone;
import mx.iteso.factory.stores.WaterIceCreamStore;

public class WaterStoreTest {

    @Test
    public void testGuavaWaterIceCream() {
        Cone cone = new WaterIceCreamStore().prepareCone("Guava");
        assertEquals(cone.getIceCream().getFlavor(), "Guava Water");
    }

    @Test
    public void testMangoWaterIceCream() {
        Cone cone = new WaterIceCreamStore().prepareCone("Mango");
        assertEquals(cone.getIceCream().getFlavor(), "Mango Water");
    }

    @Test
    public void testPineappleWaterIceCream() {
        Cone cone = new WaterIceCreamStore().prepareCone("Pineapple");
        assertEquals(cone.getIceCream().getFlavor(), "Pineapple Water");
    }

    @Test
    public void testStrawberryWaterIceCream() {
        Cone cone = new WaterIceCreamStore().prepareCone("Strawberry");
        assertEquals(cone.getIceCream().getFlavor(), "Strawberry Water");
    }

}