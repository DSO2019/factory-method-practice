package mx.iteso.stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.yoghurt.GuavaYoghurtIceCream;
import mx.iteso.icecreams.yoghurt.MangoYoghurtIceCream;
import mx.iteso.icecreams.yoghurt.PineappleYoghurtIceCream;
import mx.iteso.icecreams.yoghurt.StrawberryYoghurtIceCream;
/**
 * Yoghurt Store class.
 */
public class YoghurtStore extends IceCreamStore {
    /**
     * Implementation of function createIceCream.
     */
    @Override
    protected IceCream createIceCream(final String flavor) {
        if (flavor.equals("Strawberry")) {
            return new StrawberryYoghurtIceCream();
        } else if (flavor.equals("Pineapple")) {
            return new PineappleYoghurtIceCream();
        } else if (flavor.equals("Mango")) {
            return new MangoYoghurtIceCream();
        } else if (flavor.equals("Guava")) {
            return new GuavaYoghurtIceCream();
        }
        return null;
    }

}
