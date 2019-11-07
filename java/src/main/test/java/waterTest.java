import mx.iteso.Cone;
import mx.iteso.stores.WaterIceCream;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class waterTest {
    @Test
    public void testGuavaWaterIceCream() {
        Cone cone = new WaterIceCream().serveCone("Guava");
        assertEquals(cone.getFlavor().getFlavor(), "Guava water ice cream");
    }

    @Test
    public void testMangoWaterIceCream() {
        Cone cone = new WaterIceCream().serveCone("Mango");
        assertEquals(cone.getFlavor().getFlavor(), "Mango water ice cream");
    }

    @Test
    public void testPineappleWaterIceCream() {
        Cone cone = new WaterIceCream().serveCone("Pineapple");
        assertEquals(cone.getFlavor().getFlavor(), "Pineapple water ice cream");
    }

    @Test
    public void testStrawberryWaterIceCream() {
        Cone cone = new WaterIceCream().serveCone("Strawberry");
        assertEquals(cone.getFlavor().getFlavor(), "Strawberry water ice cream");
    }

    @Test
    public void testNoFlavorWaterIceCream() {
        Cone cone = new WaterIceCream().serveCone("");
        assertEquals(cone.getFlavor().getFlavor(), "No flavor water ice cream");
    }

}
