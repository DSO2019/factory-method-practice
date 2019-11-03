package mx.iteso;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import mx.iteso.stores.YougurtIceCreamStore;

public class YougurtIceCreamStoreTest {

    @Test
    public void testGuavaYougurtIceCream() {
        Cone cone = new YougurtIceCreamStore().prepareCone("yougurt", "Guava");
        assertEquals(cone.getIceCream().getFlavor(), "Guava Yougurt Ice Cream");
    }

    @Test
    public void testMangoYougurtIceCream() {
        Cone cone = new YougurtIceCreamStore().prepareCone("yougurt", "Mango");
        assertEquals(cone.getIceCream().getFlavor(), "Mango Yougurt Ice Cream");
    }

    @Test
    public void testPineappleYougurtIceCream() {
        Cone cone = new YougurtIceCreamStore().prepareCone("yougurt", "Pineapple");
        assertEquals(cone.getIceCream().getFlavor(), "Pineapple Yougurt Ice Cream");
    }

    @Test
    public void testStrawberryYougurtIceCream() {
        Cone cone = new YougurtIceCreamStore().prepareCone("yougurt", "Strawberry");
        assertEquals(cone.getIceCream().getFlavor(), "Strawberry Yougurt Ice Cream");
    }

}