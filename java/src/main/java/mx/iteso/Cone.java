package mx.iteso;

import mx.iteso.icecreams.IceCream;

/**
 * class Cone.
 */
public class Cone {
    /**
     * Ice Cream.
     */
    private IceCream iceCream;

    /**
     * Prepare cone.
     */
    public void prepare() {
        System.out.println("Preparing cone");
    }

    /**
     * Add Ice Cream.
     *
     * @param iceCream Ice Cream.
     */
    public void addIceCream(final IceCream iceCream) {
        this.iceCream = iceCream;
        System.out.println("Preparing " + iceCream.getFlavor() + " ice cream.");
    }

    /**
     * Serve the Ice Cream.
     */
    public void serve() {
        System.out.println("Serving cone");
    }

    /**
     * @return Ice Cream.
     */
    public IceCream getIceCream() {
        return this.iceCream;
    }
}
