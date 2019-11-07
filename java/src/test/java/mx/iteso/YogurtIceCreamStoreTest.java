package mx.iteso;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import mx.iteso.Cone;
import mx.iteso.stores.YogurtIceCreamStore;

public class YogurtIceCreamStoreTest {
    @Test
    public void yogurtIceCreamStoreGuavaTest() {
        Cone cone = new YogurtIceCreamStore().prepareCone("Guava");
        assertEquals(cone.getIceCream().getFlavor(), "Yogurt -> Guayaba");
    }

    @Test
    public void yogurtIceCreamStoreMangoTest() {
        Cone cone = new YogurtIceCreamStore().prepareCone("Mango");
        assertEquals(cone.getIceCream().getFlavor(), "Yogurt -> Mango");
    }

    @Test
    public void yogurtIceCreamStorePineappleTest() {
        Cone cone = new YogurtIceCreamStore().prepareCone("Pineapple");
        assertEquals(cone.getIceCream().getFlavor(), "Yogurt -> Piña");
    }

    @Test
    public void yogurtIceCreamStoreStrawberryTest() {
        Cone cone = new YogurtIceCreamStore().prepareCone("Strawberry");
        assertEquals(cone.getIceCream().getFlavor(), "Yogurt -> Fresa");
    }
}