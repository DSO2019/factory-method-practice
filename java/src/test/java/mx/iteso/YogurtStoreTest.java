package mx.iteso;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import mx.iteso.factory.Cone;
import mx.iteso.factory.stores.YogurtIceCreamStore;

public class YogurtStoreTest {

    @Test
    public void testGuavaYogurtIceCream() {
        Cone cone = new YogurtIceCreamStore().prepareCone("Guava");
        assertEquals(cone.getIceCream().getFlavor(), "Guava Yogurt");
    }

    @Test
    public void testMangoYogurtIceCream() {
        Cone cone = new YogurtIceCreamStore().prepareCone("Mango");
        assertEquals(cone.getIceCream().getFlavor(), "Mango Yogurt");
    }

    @Test
    public void testPineappleYogurtIceCream() {
        Cone cone = new YogurtIceCreamStore().prepareCone("Pineapple");
        assertEquals(cone.getIceCream().getFlavor(), "Pineapple Yogurt");
    }

    @Test
    public void testStrawberryYogurtIceCream() {
        Cone cone = new YogurtIceCreamStore().prepareCone("Strawberry");
        assertEquals(cone.getIceCream().getFlavor(), "Strawberry Yogurt");
    }

}