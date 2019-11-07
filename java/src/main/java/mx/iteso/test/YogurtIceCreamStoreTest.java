package mx.iteso.test;

import mx.iteso.Cone;
import mx.iteso.Stores.YogurtIceCreamStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class for yogurt ice cream tests.
 */
public class YogurtIceCreamStoreTest {
    /**
     * testing Guava Ice Cream.
     */
    @Test
    public void testGuavaYogurtIceCream() {
        Cone cone = new YogurtIceCreamStore().prepareCone("yogurt", "Guava");
        assertEquals(cone.getIceCream().getFlavor(), "Guava yogurt ice cream");
    }

    /**
     * testing Mango Ice Cream.
     */
    @Test
    public void testMangoYogurtIceCream() {
        Cone cone = new YogurtIceCreamStore().prepareCone("yogurt", "Mango");
        assertEquals(cone.getIceCream().getFlavor(), "Mango yogurt ice cream");
    }

    /**
     * testing Strawberry Ice Cream.
     */
    @Test
    public void testStrawberryYogurtIceCream() {
    Cone cone = new YogurtIceCreamStore().prepareCone("yogurt", "Strawberry");
    assertEquals(cone.getIceCream().getFlavor(), "Strawberry yogurt ice cream");
    }

    /**
     * testing Pineapple Ice Cream.
     */
    @Test
    public void testPineappleYogurtIceCream() {
    Cone cone = new YogurtIceCreamStore().prepareCone("yogurt", "Pineapple");
    assertEquals(cone.getIceCream().getFlavor(), "Pineapple yogurt ice cream");
    }
}
