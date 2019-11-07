package mx.iteso.factory.stores;

import mx.iteso.factory.IceCreamStore;
import mx.iteso.factory.icecreams.IceCream;
import mx.iteso.factory.icecreams.water.GuavaWaterIceCream;
import mx.iteso.factory.icecreams.water.MangoWaterIceCream;
import mx.iteso.factory.icecreams.water.PineappleWaterIceCream;
import mx.iteso.factory.icecreams.water.StrawberryWaterIceCream;

/** Water Ice Cream store class.*/
public class WaterIceCreamStore extends IceCreamStore {

    /**
     * Create ice cream.
     * @param selectedFlavor the flavor.
     * @return IceCream.
     */
    @Override
    protected IceCream createIceCream(final String selectedFlavor) {
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
