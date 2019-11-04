package mx.iteso;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import mx.iteso.factory.Cone;
import mx.iteso.factory.stores.MilkIceCreamStore;

public class MilkStoreTest {

    @Test
    public void testGuavaMilkIceCream() {
        Cone cone = new MilkIceCreamStore().prepareCone("Guava");
        assertEquals(cone.getIceCream().getFlavor(), "Guava Milk");
    }

    @Test
    public void testMangoMilkIceCream() {
        Cone cone = new MilkIceCreamStore().prepareCone("Mango");
        assertEquals(cone.getIceCream().getFlavor(), "Mango Milk");
    }

    @Test
    public void testPineappleMilkIceCream() {
        Cone cone = new MilkIceCreamStore().prepareCone("Pineapple");
        assertEquals(cone.getIceCream().getFlavor(), "Pineapple Milk");
    }

    @Test
    public void testStrawberryMilkIceCream() {
        Cone cone = new MilkIceCreamStore().prepareCone("Strawberry");
        assertEquals(cone.getIceCream().getFlavor(), "Strawberry Milk");
    }

}