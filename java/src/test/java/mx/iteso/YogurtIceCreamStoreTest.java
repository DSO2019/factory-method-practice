package mx.iteso;

import mx.iteso.stores.YogurtIceCreamStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YogurtIceCreamStoreTest {

    @Test
    public void testStrawberryMilkIceCream() {
        Cone cone = new YogurtIceCreamStore().prepareCone("Strawberry");
        assertEquals(cone.getIceCream().getFlavor(), "Strawberry Yogurt");
    }

    @Test
    public void testGuavaMilkIceCream() {
        Cone cone = new YogurtIceCreamStore().prepareCone("Guava");
        assertEquals(cone.getIceCream().getFlavor(), "Guava Yogurt");
    }

    @Test
    public void testPineappleMilkIceCream() {
        Cone cone = new YogurtIceCreamStore().prepareCone("Pineapple");
        assertEquals(cone.getIceCream().getFlavor(), "Pineapple Yogurt");
    }

    @Test
    public void testMangoMilkIceCream() {
        Cone cone = new YogurtIceCreamStore().prepareCone("Mango");
        assertEquals(cone.getIceCream().getFlavor(), "Mango Yogurt");
    }
}
