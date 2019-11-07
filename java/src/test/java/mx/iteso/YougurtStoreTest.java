package mx.iteso;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import mx.iteso.Cone;
import mx.iteso.stores.YougurtStore;

public class YougurtStoreTest {

    @Test
    public void testGuavaYougurtIceCream() {
        Cone cone = new YougurtStore().prepareCone("Guava");
        assertEquals(cone.getIceCream().getName(), "Guava Yougurt Icecream");
    }
    @Test
    public void testMangoYougurtIceCream() {
        Cone cone = new YougurtStore().prepareCone("Mango");
        assertEquals(cone.getIceCream().getName(), "Mango Yougurt Icecream");
    }
    @Test
    public void testPineappleYougurtIceCream() {
        Cone cone = new YougurtStore().prepareCone("Pineapple");
        assertEquals(cone.getIceCream().getName(), "Pineapple Yougurt Icecream");
    }
    @Test
    public void testStrawberryYougurtIceCream() {
        Cone cone = new YougurtStore().prepareCone("Strawberry");
        assertEquals(cone.getIceCream().getName(), "Strawberry Yougurt Icecream");
    }

}