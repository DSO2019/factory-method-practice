package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;



public class MilkIceCreamStoreTest{
    MilkIceCreamStore milkStore;
    StrawberryMilkIceCream mockedStrawberry;

    @Before
    public void setUp(){
        mockedStrawberry = mock(StrawberryMilkIceCream.class);
        milkStore = new MilkIceCreamStore();
    }

    @Test
    public void strawberryTest(){
        assertEquals(mockedStrawberry, milkStore.createIceCream("Strawberry"));
    }
}