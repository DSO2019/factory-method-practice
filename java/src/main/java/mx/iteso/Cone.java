package mx.iteso;

import mx.iteso.icecreams.IceCream;
/**
 * Clase cono, parte del helado.
 */
public class Cone {
    /**Helado. */
    private IceCream iceCream;
    /**
     * Metodo para preparar el cono.
     */
    public void prepare() {
        System.out.println("Preparando cono...");
    }
    /**
     * @param newIceCream valor del helado.
     */
    public void addIceCream(final IceCream newIceCream) {
        this.iceCream = newIceCream;
    }

    /**Sirviendo el cono con helado. */
    public void serve() {
        System.out.println("Serving...");
    }
    /**
     * @return helado actual.
     */
    public IceCream getIceCream() {
        return this.iceCream;
    }
}
