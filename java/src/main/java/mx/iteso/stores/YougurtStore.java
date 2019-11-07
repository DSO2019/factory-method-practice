package mx.iteso.stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.yougurt.GuavaYougurtIceCream;
import mx.iteso.icecreams.yougurt.MangoYougurtIceCream;
import mx.iteso.icecreams.yougurt.PineappleYougurtIceCream;
import mx.iteso.icecreams.yougurt.StrawberryYougurtIceCream;

/**
 *
 */
public class YougurtStore extends IceCreamStore {
    /**
     * @param flavor flavor.
     * @return Icecream.
     */
    public final IceCream createIceCream(final String flavor) {

        if (flavor.equals("Guava")) {
            return new GuavaYougurtIceCream();
        } else if (flavor.equals("Mango")) {
            return new MangoYougurtIceCream();
        } else if (flavor.equals("Pineapple")) {
            return new PineappleYougurtIceCream();
        } else if (flavor.equals("Strawberry")) {
            return new StrawberryYougurtIceCream();
        } else {
            return null;
        }
    }
}
