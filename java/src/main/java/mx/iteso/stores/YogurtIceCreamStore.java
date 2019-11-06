package mx.iteso.stores;

import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.yogurt.GuavaYogurtIceCream;
import mx.iteso.icecreams.yogurt.MangoYogurtIceCream;
import mx.iteso.icecreams.yogurt.PineappleYogurtIceCream;
import mx.iteso.icecreams.yogurt.StrawberryYogurtIceCream;

/**
 * Class YogurtIceCreamStore.
 */
public class YogurtIceCreamStore extends IceCreamStore {
    /**
     * @param selectedFlavor FlavorIceCream.
     * @return IceCream.
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
