package mx.iteso;

import mx.iteso.icecreams.IceCream;

public class Cone {
    /**
     * adding ice cream object.
     */
    private IceCream iceCream;

    /**
     * preparing method
     */
    public void prepare() {
        System.out.println("Preparando cono...");
    }

    /**
     *
     * @param iceCream adding the new icecream to the object.
     */
    public void addIceCream(IceCream iceCream) {
        this.iceCream = new IceCream();
        System.out.println("Añadiendo " + iceCream.getFlavor() + " al cono");
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
    public IceCream getIceCream(){
        return iceCream;
    }


}
