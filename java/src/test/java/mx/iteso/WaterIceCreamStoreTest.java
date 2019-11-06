package mx.iteso;

import mx.iteso.stores.WaterIceCreamStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterIceCreamStoreTest {

    @Test
    public void testStrawberryMilkIceCream() {
        Cone cone = new WaterIceCreamStore().prepareCone("Strawberry");
        assertEquals(cone.getIceCream().getFlavor(), "Strawberry Water");
    }

    @Test
    public void testGuavaMilkIceCream() {
        Cone cone = new WaterIceCreamStore().prepareCone("Guava");
        assertEquals(cone.getIceCream().getFlavor(), "Guava Water");
    }

    @Test
    public void testPineappleMilkIceCream() {
        Cone cone = new WaterIceCreamStore().prepareCone("Pineapple");
        assertEquals(cone.getIceCream().getFlavor(), "Pineapple Water");
    }

    @Test
    public void testMangoMilkIceCream() {
        Cone cone = new WaterIceCreamStore().prepareCone("Mango");
        assertEquals(cone.getIceCream().getFlavor(), "Mango Water");
    }
}
