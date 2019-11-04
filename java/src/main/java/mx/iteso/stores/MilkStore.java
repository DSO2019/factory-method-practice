package mx.iteso.stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.milk.GuavaMilkIceCream;
import mx.iteso.icecreams.milk.MangoMilkIceCream;
import mx.iteso.icecreams.milk.PineappleMilkIceCream;
import mx.iteso.icecreams.milk.StrawberryMilkIceCream;

/**
 * Milk Store class.
 */
public class MilkStore extends IceCreamStore {
    /**
     * Implementation of function createIceCream.
     */
    @Override
    protected IceCream createIceCream(final String flavor) {
        if (flavor.equals("Strawberry")) {
            return new StrawberryMilkIceCream();
        } else if (flavor.equals("Pineapple")) {
            return new PineappleMilkIceCream();
        } else if (flavor.equals("Mango")) {
            return new MangoMilkIceCream();
        } else if (flavor.equals("Guava")) {
            return new GuavaMilkIceCream();
        }
        return null;
    }

}
