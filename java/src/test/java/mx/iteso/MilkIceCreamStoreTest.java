package mx.iteso;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import mx.iteso.stores.MilkIceCreamStore;

public class MilkIceCreamStoreTest {

    @Test
    public void testGuavaMilkIceCream() {
        Cone cone = new MilkIceCreamStore().prepareCone("milk", "Guava");
        assertEquals(cone.getIceCream().getFlavor(), "Guava Milk Ice Cream");
    }

    @Test
    public void testMangoMilkIceCream() {
        Cone cone = new MilkIceCreamStore().prepareCone("milk", "Mango");
        assertEquals(cone.getIceCream().getFlavor(), "Mango Milk Ice Cream");
    }

    @Test
    public void testPineappleMilkIceCream() {
        Cone cone = new MilkIceCreamStore().prepareCone("milk", "Pineapple");
        assertEquals(cone.getIceCream().getFlavor(), "Pineapple Milk Ice Cream");
    }

    @Test
    public void testStrawberryMilkIceCream() {
        Cone cone = new MilkIceCreamStore().prepareCone("milk", "Strawberry");
        assertEquals(cone.getIceCream().getFlavor(), "Strawberry Milk Ice Cream");
    }

}