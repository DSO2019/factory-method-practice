package mx.iteso.stores;

import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.yogurt.GuavaYogurtIceCream;
import mx.iteso.icecreams.yogurt.MangoYogurtIceCream;
import mx.iteso.icecreams.yogurt.PineappleYogurtIceCream;
import mx.iteso.icecreams.yogurt.StrawberryYogurtIceCream;

/**
 * YogurtIceCreamStore class.
 */
public class YogurtIceCreamStore extends IceCreamStore {
    /**
     * Method to create yogurt ice creams.
     * @param selectedFlavor flavor for the ice cream to be created.
     * @return created ice cream.
     */
    public IceCream createIceCream(final String selectedFlavor) {
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
