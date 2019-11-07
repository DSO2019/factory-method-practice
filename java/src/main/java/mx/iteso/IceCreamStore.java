package mx.iteso;

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
     * @param flavor
     */
    public abstract IceCream createIceCream(String flavor);

    /**
     *
     * @param flavor
     * @return
     */
    public Cone prepareCone(final String flavor){
        IceCream iceCream = createIceCream(flavor);
        Cone cone = new Cone();
        cone.prepare();
        cone.addIceCream(iceCream);
        cone.serve();
        return cone;
    }

}
