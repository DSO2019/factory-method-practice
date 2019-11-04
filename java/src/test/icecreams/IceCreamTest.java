package test.icecreams;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.Equals;
import static org.junit.Assert.assertTrue;
import static org.junit.Before;
import static org.junit.Test;

/**
 * Ice Cream Test class.
 */
public class IceCreamTest(){
    private IceCream ic;

    /**
     * Set up method.
     */
    @Before
    public void SetUp(){
        ic = new IceCream();
    }
    /**
     * Get name test.
     */
    @Test
    public void testName(){
        assertEquals("Any IceCream", ic.getName());
    }
}
