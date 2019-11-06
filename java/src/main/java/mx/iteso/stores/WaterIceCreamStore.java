package mx.iteso.stores;

import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.water.GuavaWaterIceCream;
import mx.iteso.icecreams.water.MangoWaterIceCream;
import mx.iteso.icecreams.water.PineappleWaterIceCream;
import mx.iteso.icecreams.water.StrawberryWaterIceCream;

/**
 * Class WaterIceCreamStore.
 */
public class WaterIceCreamStore extends IceCreamStore {
    /**
     * @param selectedFlavor FlavorIceCream.
     * @return IceCream.
     */
    public IceCream createIceCream(final String selectedFlavor) {
        if (selectedFlavor.equals("Strawberry")) {
            return new StrawberryWaterIceCream();
        } else if (selectedFlavor.equals("Pineapple")) {
            return new PineappleWaterIceCream();
        } else if (selectedFlavor.equals("Mango")) {
            return new MangoWaterIceCream();
        } else if (selectedFlavor.equals("Guava")) {
            return new GuavaWaterIceCream();
        }
        return null;
    }
}
