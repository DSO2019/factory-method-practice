package mx.iteso;

import mx.iteso.icecreams.IceCream;

/**
 *Ice cream.
 */
public class Cone {
    /**
     *Ice cream.
     */
    private IceCream icecream;
    /**
     *Ice cream.
     */
    final void prepare() {
        System.out.println("Preparing cone...");
    }

    /**
     * @param iceCream icecream.
     */
    final void addIceCream(final IceCream iceCream) {
        this.icecream = iceCream;
        System.out.println("Adding " + iceCream.getName());
    }

    /**
     *Ice cream.
     */
    final void serve() {
        System.out.println("Serving...");
    }

    /**
     * @return icecream.
     */
    public IceCream getIceCream() {
        return this.icecream;
    }
}
