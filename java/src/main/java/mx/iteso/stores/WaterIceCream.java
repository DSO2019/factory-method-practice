package mx.iteso.stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.water.GuavaWaterIceCream;
import mx.iteso.icecreams.water.MangoWaterIceCream;
import mx.iteso.icecreams.water.PineappleWaterIceCream;
import mx.iteso.icecreams.water.StrawberryWaterIceCream;
import mx.iteso.icecreams.water.NoFlavorWaterIceCream;

/**
 * Para hacer llamada del helado de agua.
 */
public class WaterIceCream extends IceCreamStore {
    /**
     * Create ice cream.
     * @param selectedFlavor the desired flavor.
     * @return IceCream.
     */
    @Override
    protected IceCream iceCreamFlavor(final String selectedFlavor) {
        if (selectedFlavor.equals("Guava")) {
            return new GuavaWaterIceCream();
        } else if (selectedFlavor.equals("Mango")) {
            return new MangoWaterIceCream();
        } else if (selectedFlavor.equals("Pineapple")) {
            return new PineappleWaterIceCream();
        } else if (selectedFlavor.equals("Strawberry")) {
            return new StrawberryWaterIceCream();
        }
        return new NoFlavorWaterIceCream();
    }
}

