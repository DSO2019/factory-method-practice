package mx.iteso.icecreams.stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;


/**
 * Created by Margarita Jauregui.
 * date: Nov 5, 2019
 */
public class WaterIceCreamStore extends IceCreamStore {
    /**
     * Base type.
     */
    private final String base = "water";

    /**
     * Creates water-base IceCream.
     * @param flavor selected
     * @return icecream
     */
    @Override
    public IceCream createIceCream(final String flavor) {
        IceCream waterIceCream = createWaterIceCream(flavor);
        return waterIceCream;
    }

    /**
     * Getter method for base.
     * @return base type
     */
    public String getBase() {
        return this.base;
    }
}
