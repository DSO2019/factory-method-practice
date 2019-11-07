package test;

import mx.iteso.IceCream;
import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.water.GuavaWaterIceCream;
import mx.iteso.icecreams.water.MangoWaterIceCream;
import mx.iteso.icecreams.water.PineappleWaterIceCream;
import mx.iteso.icecreams.water.StrawberryWaterIceCream;

/**
 * Water Icecream Store
 */
public class WaterStoreTest extends IceCreamStore {

    /**
     *
     * @param flavor
     * @return
     */
    @Override
    public IceCream createIceCream(String flavor) {
            if (flavor.equals("Strawberry")) {
                return new StrawberryWaterIceCream();
            } else if (flavor.equals("Pineapple")) {
                return new PineappleWaterIceCream();
            } else if (flavor.equals("Mango")) {
                return new MangoWaterIceCream();
            } else if (flavor.equals("Guava")) {
                return new GuavaWaterIceCream();
            }
            return null;
        }
    }
