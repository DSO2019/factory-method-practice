package test.stores;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.Equals;
import static org.junit.Assert.assertTrue;
import static org.junit.Before;
import static org.junit.Test;

/**
 * Milk Store Test class.
 */
public class WaterStoreTest {
    private MilkStore milkStore;
    private Cone cone;

    /**
     * Set up method.
     */
    @Before
    public void SetUp(){
        milkStore = new MilkStore();
        cone = new Cone();
    }
    /**
     * Milk based ice cream test.
     */
    @Test
    public void MilkTest() {
        cone = milkStore.prepareCone("Guava");
        assertEquals("Guava Milk Ice Cream", cone.getIceCream().getName());
        cone = milkStore.prepareCone("Mango");
        assertEquals("Mango Milk Ice Cream", cone.getIceCream().getName());
        cone = milkStore.prepareCone("Pineapple");
        assertEquals("Pineapple Milk Ice Cream", cone.getIceCream().getName());
        cone = milkStore.prepareCone("Strawberry");
        assertEquals("Strawberry Milk Ice Cream", cone.getIceCream().getName());
    }
}
