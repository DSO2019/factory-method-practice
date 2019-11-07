package mx.iteso;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import mx.iteso.Cone;
import mx.iteso.stores.MilkStore;

public class MilkStoreTest {

    @Test
    public void testGuavaMilkIceCream() {
        Cone cone = new MilkStore().prepareCone("Guava");
        assertEquals(cone.getIceCream().getName(), "Guava Milk Icecream");
    }
    @Test
    public void testMangoMilkIceCream() {
        Cone cone = new MilkStore().prepareCone("Mango");
        assertEquals(cone.getIceCream().getName(), "Mango Milk Icecream");
    }
    @Test
    public void testPineappleMilkIceCream() {
        Cone cone = new MilkStore().prepareCone("Pineapple");
        assertEquals(cone.getIceCream().getName(), "Pineapple Milk Icecream");
    }
    @Test
    public void testStrawberryMilkIceCream() {
        Cone cone = new MilkStore().prepareCone("Strawberry");
        assertEquals(cone.getIceCream().getName(), "Strawberry Milk Icecream");
    }

}