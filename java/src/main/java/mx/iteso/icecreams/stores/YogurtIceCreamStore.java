package mx.iteso.icecreams.stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;


/**
 * Created by Margarita Jauregui.
 * date: Nov 5, 2019
 */
public class YogurtIceCreamStore extends IceCreamStore {
    /**
     * Base type.
     */
    private final String base = "yogurt";

    /**
     * Creates yogurt-based IceCream.
     * @param flavor selected
     * @return icecream
     */
    public IceCream createIceCream(final String flavor) {
        IceCream yogurtIceCream = createYogurtIceCream(flavor);
        return yogurtIceCream;
    }

    /**
     * Getter method for base.
     * @return base type
     */
    public String getBase() {
        return this.base;
    }
}
