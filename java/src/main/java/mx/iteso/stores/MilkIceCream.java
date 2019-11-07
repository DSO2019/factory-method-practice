package mx.iteso.stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.milk.StrawberryMilkIceCream;
import mx.iteso.icecreams.milk.GuavaMilkIceCream;
import mx.iteso.icecreams.milk.MangoMilkIceCream;
import mx.iteso.icecreams.milk.PineappleMilkIceCream;
import mx.iteso.icecreams.milk.NoFlavorMilkIceCream;

/**
 * Para hacer llamada del helado de leche.
 */
public class MilkIceCream extends IceCreamStore {
    /**
     * Create ice cream.
     * @param selectedFlavor the desired flavor.
     * @return IceCream.
     */
    @Override
    protected IceCream iceCreamFlavor(final String selectedFlavor) {
        if (selectedFlavor.equals("Guava")) {
            return new GuavaMilkIceCream();
        } else if (selectedFlavor.equals("Mango")) {
            return new MangoMilkIceCream();
        } else if (selectedFlavor.equals("Pineapple")) {
            return new PineappleMilkIceCream();
        } else if (selectedFlavor.equals("Strawberry")) {
            return new StrawberryMilkIceCream();
        }
        return new NoFlavorMilkIceCream();
    }
}

