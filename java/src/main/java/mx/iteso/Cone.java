package mx.iteso;

import mx.iteso.icecreams.IceCream;

/**
 * Cone Class.
 */
public class Cone {
    /** Ice of the cone.*/
    private IceCream iceCream;

    /**
     * Prepare Cone.
     */
    public void prepare() {
        System.out.println("Preparing cone");
    }

    /**
     * Add IceCream.
     * @param IceCream Ice cream to be added.
     */
    public void addIceCream(final IceCream IceCream) {
        this.iceCream = IceCream;
        System.out.println("Preparing " + iceCream.getFlavor() + " ice cream.");
    }

    /**
     * Serve cone.
     */
    public void serve() {
        System.out.println("Serving cone");
    }

    /**
     * @return getIceCream.
     */
    public IceCream getIceCream() {
        return this.iceCream;
    }
}
