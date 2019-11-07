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
     * @param flavor flavor.
     * @return cone.
     */
    public final Cone prepareCone(final String flavor) {
        IceCream iceCream;
        Cone cone = new Cone();

        cone.prepare();

        iceCream =  createIceCream(flavor);

        cone.addIceCream(iceCream);
        cone.serve();
        return cone;
    }

    /**
     * @param flavor flavor.
     * @return icecream.
     */
    public abstract IceCream createIceCream(String flavor);

}
