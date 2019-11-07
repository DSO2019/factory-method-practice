package mx.iteso.stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.yogurth.GuavaYogurthIceCream;
import mx.iteso.icecreams.yogurth.MangoYogurthIceCream;
import mx.iteso.icecreams.yogurth.PineappleYogurthIceCream;
import mx.iteso.icecreams.yogurth.StrawberryYogurthIceCream;
import mx.iteso.icecreams.yogurth.NoFlavorYogurthIceCream;

/**
 * Para hacer llamada del helado de yogurth.
 */
public class YougurthIceCream extends IceCreamStore {
    /**
     * Create ice cream.
     * @param selectedFlavor the desired flavor.
     * @return IceCream.
     */
    @Override
    protected IceCream iceCreamFlavor(final String selectedFlavor) {
        if (selectedFlavor.equals("Guava")) {
            return new GuavaYogurthIceCream();
        } else if (selectedFlavor.equals("Mango")) {
            return new MangoYogurthIceCream();
        } else if (selectedFlavor.equals("Pineapple")) {
            return new PineappleYogurthIceCream();
        } else if (selectedFlavor.equals("Strawberry")) {
            return new StrawberryYogurthIceCream();
        }
        return new NoFlavorYogurthIceCream();
    }
}
