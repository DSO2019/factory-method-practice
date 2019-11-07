package mx.iteso.stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.water.StrawberryWaterIceCream;
import mx.iteso.icecreams.water.PineappleWaterIceCream;
import mx.iteso.icecreams.water.MangoWaterIceCream;
import mx.iteso.icecreams.water.GuavaWaterIceCream;
/** Tienda de helado hecho de agua. */
public class WaterIceCreamStore extends IceCreamStore {

    /**
     * @param flavor El sabor del helado de agua.
     * @return Helado.
     */
    @Override
    protected IceCream createIceCream(final String flavor) {
        if (flavor.equals("Strawberry")) {
            return new StrawberryWaterIceCream();
        } else if (flavor.equals("Pineapple")) {
            return new PineappleWaterIceCream();
        } else if (flavor.equals("Mango")) {
            return new MangoWaterIceCream();
        } else if (flavor.equals("Guava")) {
            return new GuavaWaterIceCream();
        } else {
            return null;
        }
    }
}
