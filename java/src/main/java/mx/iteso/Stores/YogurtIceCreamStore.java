package mx.iteso.Stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.yogurt.GuavaYogurtIceCream;
import mx.iteso.icecreams.yogurt.MangoYogurtIceCream;
import mx.iteso.icecreams.yogurt.PineappleYogurtIceCream;
import mx.iteso.icecreams.yogurt.StrawberryYogurtIceCream;


/**
 * Store creates water ice creams.
 */
public class YogurtIceCreamStore extends IceCreamStore {
    /**
     *
     * @param flavor adds flavor to created ice cream.
     * @return created ice cream.
     */
    @Override
    protected IceCream createIceCream(final String flavor) {
        if (flavor.equals("Strawberry")) {
            return new StrawberryYogurtIceCream();
        } else if (flavor.equals("Guava")) {
            return new GuavaYogurtIceCream();
        } else if (flavor.equals("Mango")) {
            return new MangoYogurtIceCream();
        } else if (flavor.equals("Pineapple")) {
            return new PineappleYogurtIceCream();
        }
        return null;
    }
}
