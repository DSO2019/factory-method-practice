package test.icecreams;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.Equals;
import static org.junit.Assert.assertTrue;
import static org.junit.Before;
import static org.junit.Test;

/**
 * Cone test class.
 */
public class ConeTest {
    IceCream ic;
    Cone cone;
    /**
     * Set up method.
     */
    @Before
    public void SetUp(){
        ic = new IceCream();
        cone = new Cone();
    }
    /**
     * Prepare test.
     */
    @Test
    public void prepareTest(){
        assertEquals("Preparing cone", cone.prepare());
    }
    /**
     * Serve test.
     */
    @Test
    public void serveTest(){
        assertEquals("Serving...Any IceCream", cone.serve());
    }
}
