package mx.iteso.icecreams.stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;

/**
 * Created by Margarita Jauregui.
 * date: Nov 5, 2019
 */
public class MilkIceCreamStore extends IceCreamStore {
    /**
     *
     */
    private final String base = "milk";

    /**
     * Creates milk-based IceCream.
     * @param flavor selected
     * @return icecream
     */
    @Override
    public IceCream createIceCream(final String flavor) {
        IceCream milkIceCream = createMilkIceCream(flavor);
        return milkIceCream;
    }

    /**
     * Getter method for base.
     * @return base type
     */
    public String getBase() {
        return this.base;
    }
}
