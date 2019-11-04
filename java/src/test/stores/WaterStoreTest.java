package test.stores;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.Equals;
import static org.junit.Assert.assertTrue;
import static org.junit.Before;
import static org.junit.Test;

/**
 * Water Store Test class.
 */
public class WaterStoreTest {
    private WaterStore waterStore;
    private Cone cone;

    /**
     * Set up method.
     */
    @Before
    public void SetUp(){
        waterStore = new WaterStore();
        cone = new Cone();
    }
    /**
     * Water bases ice cream test.
     */
    @Test
    public void WaterTest() {
        cone = waterStore.prepareCone("Guava");
        assertEquals("Guava Water Ice Cream", cone.getIceCream().getName());
        cone = waterStore.prepareCone("Mango");
        assertEquals("Mango Water Ice Cream", cone.getIceCream().getName());
        cone = waterStore.prepareCone("Pineapple");
        assertEquals("Pineapple Water Ice Cream", cone.getIceCream().getName());
        cone = waterStore.prepareCone("Strawberry");
        assertEquals("Strawberry Water Ice Cream", cone.getIceCream().getName());
    }
}
