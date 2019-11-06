package mx.iteso.stores;

import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.milk.GuavaMilkIceCream;
import mx.iteso.icecreams.milk.MangoMilkIceCream;
import mx.iteso.icecreams.milk.PineappleMilkIceCream;
import mx.iteso.icecreams.milk.StrawberryMilkIceCream;

/**
 * Class MilkIceCreamStore.
 */
public class MilkIceCreamStore extends IceCreamStore {
    /**
     * @param selectedFlavor ice cream flavor.
     * @return IceCream.
     */
    public IceCream createIceCream(final String selectedFlavor) {
        if (selectedFlavor.equals("Strawberry")) {
            return new StrawberryMilkIceCream();
        } else if (selectedFlavor.equals("Pineapple")) {
            return new PineappleMilkIceCream();
        } else if (selectedFlavor.equals("Mango")) {
            return new MangoMilkIceCream();
        } else if (selectedFlavor.equals("Guava")) {
            return new GuavaMilkIceCream();
        }
        return null;
    }
}
