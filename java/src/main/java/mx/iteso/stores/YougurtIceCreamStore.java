package mx.iteso.stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.yougurt.GuavaYougurtIceCream;
import mx.iteso.icecreams.yougurt.MangoYougurtIceCream;
import mx.iteso.icecreams.yougurt.PineappleYougurtIceCream;
import mx.iteso.icecreams.yougurt.StrawberryYougurtIceCream;

/**
 * Yougurt Ice Cream Store.
 */
public class YougurtIceCreamStore extends IceCreamStore {

    /**
     * Create ice cream implementation.
     * @param flavor the new flavor.
     * @return new IceCream.
     */
    @Override
    protected IceCream createIceCream(final String flavor) {
        if (flavor.equals("Strawberry")) {
            return new StrawberryYougurtIceCream();
        } else if (flavor.equals("Pineapple")) {
            return new PineappleYougurtIceCream();
        } else if (flavor.equals("Mango")) {
            return new MangoYougurtIceCream();
        } else if (flavor.equals("Guava")) {
            return new GuavaYougurtIceCream();
        }
        return null;
    }
}
