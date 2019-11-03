package mx.iteso;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import mx.iteso.stores.WaterIceCreamStore;

public class WaterIceCreamStoreTest {

    @Test
    public void testGuavaWaterIceCream() {
        Cone cone = new WaterIceCreamStore().prepareCone("water", "Guava");
        assertEquals(cone.getIceCream().getFlavor(), "Guava Water Ice Cream");
    }

    @Test
    public void testMangoWaterIceCream() {
        Cone cone = new WaterIceCreamStore().prepareCone("water", "Mango");
        assertEquals(cone.getIceCream().getFlavor(), "Mango Water Ice Cream");
    }

    @Test
    public void testPineappleWaterIceCream() {
        Cone cone = new WaterIceCreamStore().prepareCone("water", "Pineapple");
        assertEquals(cone.getIceCream().getFlavor(), "Pineapple Water Ice Cream");
    }

    @Test
    public void testStrawberryWaterIceCream() {
        Cone cone = new WaterIceCreamStore().prepareCone("water", "Strawberry");
        assertEquals(cone.getIceCream().getFlavor(), "Strawberry Water Ice Cream");
    }

}