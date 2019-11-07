package mx.iteso.factory.stores;

import mx.iteso.factory.IceCreamStore;
import mx.iteso.factory.icecreams.IceCream;
import mx.iteso.factory.icecreams.milk.GuavaMilkIceCream;
import mx.iteso.factory.icecreams.milk.MangoMilkIceCream;
import mx.iteso.factory.icecreams.milk.PineappleMilkIceCream;
import mx.iteso.factory.icecreams.milk.StrawberryMilkIceCream;

/** Milk Ice Cream store class.*/
public class MilkIceCreamStore extends IceCreamStore {

    /**
     * Create ice cream.
     * @param selectedFlavor the flavor.
     * @return IceCream.
     */
    @Override
    protected IceCream createIceCream(final String selectedFlavor) {
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
