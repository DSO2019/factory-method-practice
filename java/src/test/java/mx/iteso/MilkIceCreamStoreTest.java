package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

import mx.iteso.*;



public class MilkIceCreamStoreTest{
    MilkIceCreamStore milkStore;

    @Before
    public void setUp(){
        milkStore = new MilkIceCreamStore();
    }

    @Test
    public void strawberryTest(){
        assertEquals("Strawberry Milk Ice Cream", milkStore.prepareCone("Strawberry").getCone());
    }

    @Test
    public void guavaTest(){
        assertEquals("Guava Milk Ice Cream", milkStore.prepareCone("Guava").getCone());
    }

    @Test
    public void mangoTest(){
        assertEquals("Mango Milk Ice Cream", milkStore.prepareCone("Mango").getCone());
    }

    @Test
    public void pineappleTest(){
        assertEquals("Pineapple Milk Ice Cream", milkStore.prepareCone("Pineapple").getCone());
    }
}