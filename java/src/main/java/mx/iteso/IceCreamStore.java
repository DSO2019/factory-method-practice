package mx.iteso;

import mx.iteso.icecreams.IceCream;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/17/18
 * Time: 1:21 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class IceCreamStore {

    /**
     * Creación del sabor para el helado.
     * Se paso el contenido a cada tienda.
     * @param flavor sabor del helado.
     * @return el helado.
     */
    protected abstract IceCream iceCreamFlavor(String flavor);

    /**
     * Preparar y servir cono a cliente.
     * @param flavor Da la referencia al sabor del helado.
     * @return el cono.
     */
    public Cone serveCone(final String flavor) {
        /**
         * Instancias de helados.
         */
        IceCream iceCream = new IceCream();
        Cone cone = new Cone();
        /**
         * Definir el sabor de clase abstracta
         */
        iceCream = iceCreamFlavor(flavor);

        /**
         * Los 3 metodos de cono.
         */
        cone.prepare();

        cone.addIceCream(iceCream);

        cone.serve();

        return cone;
    }
}
