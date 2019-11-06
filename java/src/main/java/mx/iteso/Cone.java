package mx.iteso;

import mx.iteso.icecreams.IceCream;

/**
 * Class cone.
 */
public class Cone {
    /** Ice of the cone.*/
    private IceCream iceCream;

    /**
     * Method to prepare the cone.
     */
    public void prepare() {
        System.out.println("Preparing cone");
    }

    /**
     * Method to add an ice cream.
     * @param selectedIceCream Ice cream to be added.
     */
    public void addIceCream(final IceCream selectedIceCream) {
        this.iceCream = selectedIceCream;
        System.out.println("Preparing " + iceCream.getFlavor() + " ice cream.");
    }

    /**
     * Method to serve the cone.
     */
    public void serve() {
        System.out.println("Serving cone");
    }

    /**
     *
     * @return current cone ice cream.
     */
    public IceCream getIceCream() {
        return this.iceCream;
    }
}
