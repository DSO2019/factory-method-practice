package mx.iteso.factory;

import mx.iteso.factory.icecreams.IceCream;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/17/18
 * Time: 1:21 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class IceCreamStore {

    /**
     * Ice cream creation method.
     * @param flavor the flavor.
     * @return ice cream created.
     */
    protected abstract IceCream createIceCream(String flavor);

    /**
     * Cone preparation class.
     * @param flavor the flavor.
     * @return prepared cone.
     */
    public Cone prepareCone(final String flavor) {
        IceCream iceCream = new IceCream();
        Cone cone = new Cone();

        cone.prepare();

        iceCream = createIceCream(flavor);

        cone.addIceCream(iceCream);
        cone.serve();

        return cone;
    }

}
