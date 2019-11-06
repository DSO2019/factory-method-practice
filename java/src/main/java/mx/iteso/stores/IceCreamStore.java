package mx.iteso.stores;

import mx.iteso.Cone;
import mx.iteso.icecreams.IceCream;

/**
 * Abstract class IceCreamStore.
 */
public abstract class IceCreamStore {
    /**
     * Create Ice Cream.
     *
     * @param flavor flavor.
     * @return IceCream
     */
    public abstract IceCream createIceCream(String flavor);

    /**
     * Prepare Cone.
     *
     * @param flavor ice cream flavor
     * @return Cone
     */
    public Cone prepareCone(final String flavor) {
        IceCream iceCream = createIceCream(flavor);
        Cone cone = new Cone();
        cone.prepare();
        cone.addIceCream(iceCream);
        cone.serve();
        return cone;
    }
}
