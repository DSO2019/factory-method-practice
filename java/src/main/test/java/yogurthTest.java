import mx.iteso.Cone;
import mx.iteso.stores.WaterIceCream;
import mx.iteso.stores.YougurthIceCream;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class yogurthTest {
    @Test
    public void testGuavaYogurthIceCream() {
        Cone cone = new YougurthIceCream().serveCone("Guava");
        assertEquals(cone.getFlavor().getFlavor(), "Guava yogurth ice cream");
    }

    @Test
    public void testMangoYogurthIceCream() {
        Cone cone = new YougurthIceCream().serveCone("Mango");
        assertEquals(cone.getFlavor().getFlavor(), "Mango yogurth ice cream");
    }

    @Test
    public void testPineappleYogurthIceCream() {
        Cone cone = new YougurthIceCream().serveCone("Pineapple");
        assertEquals(cone.getFlavor().getFlavor(), "Pineapple yogurth ice cream");
    }

    @Test
    public void testStrawberryYogurthIceCream() {
        Cone cone = new YougurthIceCream().serveCone("Strawberry");
        assertEquals(cone.getFlavor().getFlavor(), "Strawberry yogurth ice cream");
    }

    @Test
    public void testNoFlavorYogurthIceCream() {
        Cone cone = new YougurthIceCream().serveCone("");
        assertEquals(cone.getFlavor().getFlavor(), "No flavor yogurth ice cream");
    }
}
