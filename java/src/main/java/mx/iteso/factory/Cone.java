package mx.iteso.factory;

import mx.iteso.factory.icecreams.IceCream;

/** Cone class. */
public class Cone {

    /** Ice cream contained in cone. */
    private IceCream iceCream;

    /** Preparing alert method. */
    public void prepare() {
        System.out.println("Preparing ice cream");
    }

    /** Ice Cream adding method.
     * @param selectedIceCream the ice cream.
     */
    public void addIceCream(final IceCream selectedIceCream) {
        this.iceCream = selectedIceCream;
        System.out.println("Preparing " + iceCream.getFlavor() + " ice cream.");
    }

    /** Serving alert method. */
    public void serve() {
        System.out.println("Serving cone");
    }

    /** IceCream getter.
     * @return the ice cream contained in the cone.
     */
    public IceCream getIceCream() {
        return this.iceCream;
    }
}
