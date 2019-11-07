package mx.iteso.Stores;

import mx.iteso.IceCreamStore;
import mx.iteso.IceCream;
import mx.iteso.icecreams.milk.GuavaMilkIceCream;
import mx.iteso.icecreams.milk.MangoMilkIceCream;
import mx.iteso.icecreams.milk.PineappleMilkIceCream;
import mx.iteso.icecreams.milk.StrawberryMilkIceCream;

public class MilkIceCreamStore extends IceCreamStore {
    /**
     *
     * @param flavor
     * @return
     */
    @Override
    public IceCream createIceCream(String flavor) {
        if (flavor.equals("Strawberry")) {
            return new StrawberryMilkIceCream();
        } else if (flavor.equals("Pineapple")) {
            return new PineappleMilkIceCream();
        } else if (flavor.equals("Mango")) {
            return new MangoMilkIceCream();
        } else if (flavor.equals("Guava")) {
            return new GuavaMilkIceCream();
        }
        return null;
    }
}

