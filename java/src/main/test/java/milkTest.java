import mx.iteso.Cone;
import mx.iteso.icecreams.IceCream;
import mx.iteso.stores.MilkIceCream;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class milkTest {
    @Test
    public void testGuavaMilkIceCream() {
        Cone cone = new MilkIceCream().serveCone("Guava");
        assertEquals(cone.getFlavor().getFlavor(), "Guava milk ice cream");
    }

    @Test
    public void testMangoMilkIceCream() {
        Cone cone = new MilkIceCream().serveCone("Mango");
        assertEquals(cone.getFlavor().getFlavor(), "Mango milk ice cream");
    }

    @Test
    public void testPineappleMilkIceCream() {
        Cone cone = new MilkIceCream().serveCone("Pineapple");
        assertEquals(cone.getFlavor().getFlavor(), "Pineapple milk ice cream");
    }

    @Test
    public void testStrawberryMilkIceCream() {
        Cone cone = new MilkIceCream().serveCone("Strawberry");
        assertEquals(cone.getFlavor().getFlavor(), "Strawberry milk ice cream");
    }

    @Test
    public void testNoFlavorMilkIceCream() {
        Cone cone = new MilkIceCream().serveCone("");
        assertEquals(cone.getFlavor().getFlavor(), "No flavor milk ice cream");
    }

}
