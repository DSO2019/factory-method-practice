package mx.iteso.stores;

import mx.iteso.Cone;
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
     * @param flavor flavor of the ice cream to be created
     * @return generated ice cream
     */
    public abstract IceCream createIceCream(String flavor);
    /**
     * Method to prepare a cone of ice cream.
     * @param flavor flavor of the ice cream ti be placed in the cone
     * @return cone
     */
    public Cone prepareCone(final String flavor) {
        IceCream iceCream = createIceCream(flavor);
        Cone cone = new Cone();
        cone.prepare();
        cone.addIceCream(iceCream);
        cone.serve();
        return cone;
    }
}
