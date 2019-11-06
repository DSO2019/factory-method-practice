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
    Método abstracto a implementar por cada una de las tiendas específicas.
    @param flavour sabor.
    @return regresará el objeto helado correspodiente.
     */
    public abstract IceCream createIceCream(String flavour);

    /**
    Método para preparar cono.
    @param flavour sabor.
    @return objeto cono.
     */
    public final Cone prepareCone(final String flavour) {
        IceCream iceCream = new IceCream();
        Cone cone = new Cone();

        cone.prepare();
        iceCream = createIceCream(flavour);
        cone.addIceCream(iceCream);
        cone.serve();

        return cone;
    }
}
