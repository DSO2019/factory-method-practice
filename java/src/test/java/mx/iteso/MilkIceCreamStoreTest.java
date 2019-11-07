package mx.iteso;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import mx.iteso.Cone;
import mx.iteso.stores.MilkIceCreamStore;

public class MilkIceCreamStoreTest {
    @Test
    public void milkIceCreamStoreGuavaTest() {
        Cone cone = new MilkIceCreamStore().prepareCone("Guava");
        assertEquals(cone.getIceCream().getFlavor(), "Leche -> Guayaba");
    }

    @Test
    public void milkIceCreamStoreMangoTest() {
        Cone cone = new MilkIceCreamStore().prepareCone("Mango");
        assertEquals(cone.getIceCream().getFlavor(), "Leche -> Mango");
    }

    @Test
    public void milkIceCreamStorePineappleTest() {
        Cone cone = new MilkIceCreamStore().prepareCone("Pineapple");
        assertEquals(cone.getIceCream().getFlavor(), "Leche -> Piña");
    }

    @Test
    public void milkIceCreamStoreStrawberryTest() {
        Cone cone = new MilkIceCreamStore().prepareCone("Strawberry");
        assertEquals(cone.getIceCream().getFlavor(), "Leche -> Fresa");
    }
}