package mx.iteso;

import mx.iteso.icecreams.IceCream;

/**
 * Cone class.
 */
public class Cone {

    /**
     * IceCream attribute.
     */
    private IceCream iceCream;

    /**
     * Prepare cone method.
     */
    public void prepare() {
        System.out.println("Prepare cone...");
    }

    /**
     * Add Ice cream to cone.
     * @param newIceCream Ice Cream parameter.
     */
    public void addIceCream(final IceCream newIceCream) {
        this.iceCream = newIceCream;
        System.out.println("Adding " + iceCream.getFlavor() + " to cone.");
    }

    /**
     * Serve the cone.
     */
    public void serve() {
        System.out.println("Serving...");
    }

    /**
     * Get the ice cream.
     * @return the iceCream
     */
    public IceCream getIceCream() {
        return iceCream;
    }
}
