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
     * Create ice cream abstract method.
     * @param flavor the flavor.
     * @return the IceCream.
     */
    protected abstract IceCream createIceCream(String flavor);

    /**
     * Prepare cone.
     * @param base the base.
     * @param flavor the flavor.
     * @return the Cone.
     */
    public Cone prepareCone(final String base, final String flavor) {
        IceCream iceCream = new IceCream();
        Cone cone = new Cone();

        cone.prepare();

        iceCream = createIceCream(flavor);

        cone.addIceCream(iceCream);
        cone.serve();

        return cone;
    }

}
