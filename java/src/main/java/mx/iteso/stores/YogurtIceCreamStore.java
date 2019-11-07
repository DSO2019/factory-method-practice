package mx.iteso.stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.yogurt.StrawberryYogurtIceCream;
import mx.iteso.icecreams.yogurt.PineappleYogurtIceCream;
import mx.iteso.icecreams.yogurt.MangoYogurtIceCream;
import mx.iteso.icecreams.yogurt.GuavaYogurtIceCream;
/** Tienda de helado hecho de yogurt. */
public class YogurtIceCreamStore extends IceCreamStore {

    /**
     * @param flavor El sabor del helado de yogurt.
     * @return Helado.
     */
    @Override
    protected IceCream createIceCream(final String flavor) {
        if (flavor.equals("Strawberry")) {
            return new StrawberryYogurtIceCream();
        } else if (flavor.equals("Pineapple")) {
            return new PineappleYogurtIceCream();
        } else if (flavor.equals("Mango")) {
            return new MangoYogurtIceCream();
        } else if (flavor.equals("Guava")) {
            return new GuavaYogurtIceCream();
        } else {
            return null;
        }
    }
}
