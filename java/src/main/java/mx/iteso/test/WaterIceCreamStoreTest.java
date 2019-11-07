package mx.iteso.test;

import mx.iteso.Cone;
import mx.iteso.Stores.WaterIceCreamStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class for water ice cream tests.
 */
public class WaterIceCreamStoreTest {
    /**
     * testing Guava Ice Cream.
     */
    @Test
    public void testGuavaWaterIceCream() {
        Cone cone = new WaterIceCreamStore().prepareCone("water", "Guava");
        assertEquals(cone.getIceCream().getFlavor(), "Guava water ice cream");
    }

    /**
     * testing Mango Ice Cream.
     */
    @Test
    public void testMangoWaterIceCream() {
        Cone cone = new WaterIceCreamStore().prepareCone("water", "Mango");
        assertEquals(cone.getIceCream().getFlavor(), "Mango water ice cream");
    }

    /**
     * testing Strawberry Ice Cream.
     */
    @Test
    public void testStrawberryWaterIceCream() {
        Cone cone = new WaterIceCreamStore().prepareCone("water", "Strawberry");
    assertEquals(cone.getIceCream().getFlavor(), "Strawberry water ice cream");
    }

    /**
     * testing Pineapple Ice Cream.
     */
    @Test
    public void testPineappleWaterIceCream() {
    Cone cone = new WaterIceCreamStore().prepareCone("water", "Pineapple");
    assertEquals(cone.getIceCream().getFlavor(), "Pineapple water ice cream");
    }
}
