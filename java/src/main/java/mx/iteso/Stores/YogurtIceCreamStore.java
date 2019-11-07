package mx.iteso.Stores;

import mx.iteso.IceCream;
import mx.iteso.icecreams.yogurt.PineappleYogurtIceCream;

public class YogurtIceCreamStore {
    /**
     *
     * @param flavor
     * @return
     */
    @Override
    public IceCream createIceCream(String flavor) {
        if (flavor.equals("Strawberry")) {
            return new StrawberryYogurtIceCream();
        } else if (flavor.equals("Pineapple")) {
            return new PineappleYogurtIceCream();
        } else if (flavor.equals("Mango")) {
            return new MangoYogurtIceCream();
        } else if (flavor.equals("Guava")) {
            return new GuavaYogurtIceCream();
        }
        return null;
    }
}
