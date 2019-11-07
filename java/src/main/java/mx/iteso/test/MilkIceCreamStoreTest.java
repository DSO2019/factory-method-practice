package mx.iteso.test;


import mx.iteso.Cone;
import mx.iteso.Stores.MilkIceCreamStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class for water ice cream tests.
 */
public class MilkIceCreamStoreTest {
    /**
     * testing Guava ice  Cream.
     */
    @Test
    public void testGuavaMilkIceCream() {
        Cone cone = new MilkIceCreamStore().prepareCone("milk", "Guava");
        assertEquals(cone.getIceCream().getFlavor(), "Guava milk ice cream");
    }

    /**
     * testing Mango ice  Cream.
     */
    @Test
    public void testMangoMilkIceCream() {
        Cone cone = new MilkIceCreamStore().prepareCone("milk", "Mango");
        assertEquals(cone.getIceCream().getFlavor(), "Mango milk ice cream");
    }

    /**
     * testing Strawberry ice  Cream.
     */
    @Test
    public void testStrawberryMilkIceCream() {
        Cone cone = new MilkIceCreamStore().prepareCone("milk", "Strawberry");
    assertEquals(cone.getIceCream().getFlavor(), "Strawberry milk ice cream");
    }

    /**
     * testing Pineapple ice  Cream.
     */
    @Test
    public void testPineappleMilkIceCream() {
        Cone cone = new MilkIceCreamStore().prepareCone("milk", "Pineapple");
    assertEquals(cone.getIceCream().getFlavor(), "Pineapple milk ice cream");
    }
}
