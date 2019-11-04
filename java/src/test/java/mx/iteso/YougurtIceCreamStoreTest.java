package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

import mx.iteso.stores.*;


public class YougurtIceCreamStoreTest{
    YougurtIceCreamStore yougurtStore;

    @Before
    public void setUp(){
        yougurtStore = new YougurtIceCreamStore();
    }

    @Test
    public void strawberryTest(){
        assertEquals("Strawberry Yougurt Ice Cream", yougurtStore.prepareCone("Strawberry").getCone());
    }

    @Test
    public void guavaTest(){
        assertEquals("Guava Yougurt Ice Cream", yougurtStore.prepareCone("Guava").getCone());
    }

    @Test
    public void mangoTest(){
        assertEquals("Mango Yougurt Ice Cream", yougurtStore.prepareCone("Mango").getCone());
    }

    @Test
    public void pineappleTest(){
        assertEquals("Pineapple Yougurt Ice Cream", yougurtStore.prepareCone("Pineapple").getCone());
    }
}