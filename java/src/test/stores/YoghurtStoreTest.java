package test.stores;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.Equals;
import static org.junit.Assert.assertTrue;
import static org.junit.Before;
import static org.junit.Test;

/**
 * Yoghurt Store Test class.
 */
public class YoghurtStoreTest {
    private YoghurtStore yoghurtStore;
    private Cone cone;

    /**
     * Set up method.
     */
    @Before
    public void SetUp(){
        yoghurtStore = new YoghurtStore();
        cone = new Cone();
    }
    /**
     * Yoghurt based ice cream test.
     */
    @Test void YoghurtTest() {
        cone = yoghurtStore.prepareCone("Guava");
        assertEquals("Guava Yoghurt Ice Cream", cone.getIceCream().getName());
        cone = yoghurtStore.prepareCone("Mango");
        assertEquals("Mango Yoghurt Ice Cream", cone.getIceCream().getName());
        cone = yoghurtStore.prepareCone("Pineapple");
        assertEquals("Pineapple Yoghurt Ice Cream", cone.getIceCream().getName());
        cone = yoghurtStore.prepareCone("Strawberry");
        assertEquals("Strawberry Yoghurt Ice Cream", cone.getIceCream().getName());
    }
}

