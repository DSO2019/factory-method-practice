package mx.iteso.stores;

import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.water.GuavaWaterIceCream;
import mx.iteso.icecreams.water.MangoWaterIceCream;
import mx.iteso.icecreams.water.PineappleWaterIceCream;
import mx.iteso.icecreams.water.StrawberryWaterIceCream;

/**
 * class WaterIceCreamStore.
 */
public class WaterIceCreamStore extends IceCreamStore {
    /**
     * Create an Ice Cream.
     *
     * @param flavor flavor passed.
     * @return Ice Cream.
     */
    public IceCream createIceCream(final String flavor) {
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
