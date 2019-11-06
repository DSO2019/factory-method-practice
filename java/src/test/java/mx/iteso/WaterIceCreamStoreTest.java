package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

import mx.iteso.*;



public class WaterIceCreamStoreTest{
    WaterIceCreamStore waterStore;

    @Before
    public void setUp(){
        waterStore = new WaterIceCreamStore();
    }

    @Test
    public void strawberryTest(){
        assertEquals("Strawberry Water Ice Cream", waterStore.prepareCone("Strawberry").getCone());
    }

    @Test
    public void guavaTest(){
        assertEquals("Guava Water Ice Cream", waterStore.prepareCone("Guava").getCone());
    }

    @Test
    public void mangoTest(){
        assertEquals("Mango Water Ice Cream", waterStore.prepareCone("Mango").getCone());
    }

    @Test
    public void pineappleTest(){
        assertEquals("Pineapple Water Ice Cream", waterStore.prepareCone("Pineapple").getCone());
    }
}