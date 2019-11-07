package test;

import mx.iteso.Cone;
import mx.iteso.IceCream;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import mx.iteso.Stores.YogurtIceCreamStore;

public class YogurtStoreTest {

    @Test
    public void testGuavaYogurtIceCream() {
        Cone cone = new YogurtIceCreamStore().prepareCone("Guava");
        assertEquals(cone.getIcecream().getFlavor(), "Guava Yogurt");
    }

    @Test
    public void testMangoYogurtIceCream() {
        Cone cone = new YogurtIceCreamStore().prepareCone("Mango");
        assertEquals(cone.getIcecream().getFlavor(), "Mango Yogurt");
    }

    @Test
    public void testPineappleYogurtIceCream() {
        Cone cone = new YogurtIceCreamStore().prepareCone("Pineapple");
        assertEquals(cone.getIcecream().getFlavor(), "Pineapple Yogurt");
    }

    @Test
    public void testStrawberryYogurtIceCream() {
        Cone cone = new YogurtIceCreamStore().prepareCone("Strawberry");
        assertEquals(cone.getIcecream().getFlavor(), "Strawberry Yogurt");
    }
}
}
