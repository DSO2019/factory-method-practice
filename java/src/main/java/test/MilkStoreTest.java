package test;

import mx.iteso.Cone;

import mx.iteso.Stores.MilkIceCreamStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MilkStoreTest {
    @Test
    public void testGuavaMilkIceCream() {
        Cone cone = new MilkIceCreamStore().prepareCone("Guava");
        assertEquals(cone.getIcecream().getFlavor(), "Guava Milk");
    }

    @Test
    public void testMangoMilkIceCream() {
        Cone cone = new MilkIceCreamStore().prepareCone("Mango");
        assertEquals(cone.getIcecream().getFlavor(), "Mango Milk");
    }

    @Test
    public void testPineappleMilkIceCream() {
        Cone cone = new MilkIceCreamStore().prepareCone("Pineapple");
        assertEquals(cone.getIcecream().getFlavor(), "Pineapple Milk");
    }

    @Test
    public void testStrawberryMilkIceCream() {
        Cone cone = new MilkIceCreamStore().prepareCone("Strawberry");
        assertEquals(cone.getIcecream().getFlavor(), "Strawberry Milk");
    }
}
