package mx.iteso.stores;

import mx.iteso.Cone;
import mx.iteso.icecreams.IceCream;

/**
 * abstract class iceCream.
 */
public abstract class IceCreamStore {
    /**
     * @param flavor flavor of the ice cream to be created
     * @return generated ice cream
     */
    public abstract IceCream createIceCream(String flavor);
    /**
     * Prepare ice cream
     * @param flavor iceCreamFlavor
     * @return cone
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
