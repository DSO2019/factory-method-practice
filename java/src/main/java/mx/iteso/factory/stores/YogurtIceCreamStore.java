package mx.iteso.factory.stores;

import mx.iteso.factory.IceCreamStore;
import mx.iteso.factory.icecreams.IceCream;
import mx.iteso.factory.icecreams.yogurt.GuavaYogurtIceCream;
import mx.iteso.factory.icecreams.yogurt.MangoYogurtIceCream;
import mx.iteso.factory.icecreams.yogurt.PineappleYogurtIceCream;
import mx.iteso.factory.icecreams.yogurt.StrawberryYogurtIceCream;

/** Yogurt Ice Cream store class.*/
public class YogurtIceCreamStore extends IceCreamStore {

    /**
     * Create ice cream.
     * @param selectedFlavor the flavor.
     * @return IceCream.
     */
    @Override
    protected IceCream createIceCream(final String selectedFlavor) {
        if (selectedFlavor.equals("Strawberry")) {
            return new StrawberryYogurtIceCream();
        } else if (selectedFlavor.equals("Pineapple")) {
            return new PineappleYogurtIceCream();
        } else if (selectedFlavor.equals("Mango")) {
            return new MangoYogurtIceCream();
        } else if (selectedFlavor.equals("Guava")) {
            return new GuavaYogurtIceCream();
        }
        return null;
    }
}
