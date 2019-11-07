package mx.iteso.stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.milk.StrawberryMilkIceCream;
import mx.iteso.icecreams.milk.PineappleMilkIceCream;
import mx.iteso.icecreams.milk.MangoMilkIceCream;
import mx.iteso.icecreams.milk.GuavaMilkIceCream;

/** Tienda de helado hecho de leche. */
public class MilkIceCreamStore extends IceCreamStore {

    /**
     * @param flavor El sabor del helado de leche.
     * @return Helado.
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
        } else {
            return null;
        }
    }
}
