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
     * @return Cone. PrepareCone function.
     * @param flavor IceCream flavor.
     */
    public Cone prepareCone(final String flavor) {
        IceCream iceCream;
        Cone cone = new Cone();
        iceCream = createIceCream(flavor);
        cone.prepare();
        cone.addIceCream(iceCream);
        cone.serve();
        return cone;
    }
    /**
     * @return IceCream. Creates ice cream of a certain flavor.
     * @param flavor IceCream flavor.
     */
    protected abstract IceCream createIceCream(String flavor);
}
