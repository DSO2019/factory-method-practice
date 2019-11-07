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
     *
     * @param flavor adds the flavor.
     * @return ice cream created
     */
    protected abstract IceCream createIceCream(String flavor);

    /**
     *  @param base adds ice cream base (milk or water).
     * @param flavor adds ice cream flavor.
     * @return creted cone.
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
