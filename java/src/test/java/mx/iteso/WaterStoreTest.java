package mx.iteso;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import mx.iteso.Cone;
import mx.iteso.stores.WaterStore;

public class WaterStoreTest {

    @Test
    public void testGuavaWaterIceCream() {
        Cone cone = new WaterStore().prepareCone("Guava");
        assertEquals(cone.getIceCream().getName(), "Guava Water Icecream");
    }
    @Test
    public void testMangoWaterIceCream() {
        Cone cone = new WaterStore().prepareCone("Mango");
        assertEquals(cone.getIceCream().getName(), "Mango Water Icecream");
    }
    @Test
    public void testPineappleWaterIceCream() {
        Cone cone = new WaterStore().prepareCone("Pineapple");
        assertEquals(cone.getIceCream().getName(), "Pineapple Water Icecream");
    }
    @Test
    public void testStrawberryWaterIceCream() {
        Cone cone = new WaterStore().prepareCone("Strawberry");
        assertEquals(cone.getIceCream().getName(), "Strawberry Water Icecream");
    }

}