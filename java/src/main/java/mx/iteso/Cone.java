package mx.iteso;

import mx.iteso.icecreams.IceCream;

/**
 * Class controls cone object.
 */
public class Cone {
    /**
     * adding ice cream object.
     */
    private IceCream iceCream1;

    /**
     * preparing method.
     */
    public void prepare() {
        System.out.println("Preparando cono...");
    }


     /**
     *
     * @param iceCream2 adding the new icecream to the object.
     */

    public void addIceCream(final IceCream iceCream2) {
        this.iceCream1 = iceCream2;
        System.out.println("Añadiendo " + iceCream2.getFlavor() + " al cono");
    }

    /**
     * Serves the icecream.
     */
    public void serve() {
        System.out.println("Sirviendo cono...");
    }

    /**
     *
     * @return ice cream object.
     */
    public IceCream getIceCream() {
        return iceCream1;
    }


}
