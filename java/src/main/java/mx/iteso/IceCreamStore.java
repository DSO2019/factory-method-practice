package mx.iteso;

import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.milk.GuavaMilkIceCream;
import mx.iteso.icecreams.milk.MangoMilkIceCream;
import mx.iteso.icecreams.milk.PineappleMilkIceCream;
import mx.iteso.icecreams.milk.StrawberryMilkIceCream;
import mx.iteso.icecreams.water.GuavaWaterIceCream;
import mx.iteso.icecreams.water.MangoWaterIceCream;
import mx.iteso.icecreams.water.PineappleWaterIceCream;
import mx.iteso.icecreams.water.StrawberryWaterIceCream;
import mx.iteso.icecreams.yogurt.GuavaYogurtIceCream;
import mx.iteso.icecreams.yogurt.MangoYogurtIceCream;
import mx.iteso.icecreams.yogurt.PineappleYogurtIceCream;
import mx.iteso.icecreams.yogurt.StrawberryYogurtIceCream;


/**
 * Created by Margarita Jauregui.
 * date: Nov 5, 2019
 */
public abstract class IceCreamStore {
    /**
     * Creates milk-base IceCream object with selected flavor.
     * @param flavor selected
     * @return new IceCream object
     */
    public IceCream createMilkIceCream(final String flavor) {

        if (flavor.equals("Strawberry")) {
            return new StrawberryMilkIceCream();
        } else if (flavor.equals("Pineapple")) {
            return new PineappleMilkIceCream();
        } else if (flavor.equals("Mango")) {
            return new MangoMilkIceCream();
        } else if (flavor.equals("Guava")) {
            return new GuavaMilkIceCream();
        }
        return null;
    }

    /**
     * Creates water-based IceCream object with selected flavor.
     * @param flavor selected
     * @return new IceCream object
     */
    public IceCream createWaterIceCream(final String flavor) {

        if (flavor.equals("Strawberry")) {
            return new StrawberryWaterIceCream();
        } else if (flavor.equals("Pineapple")) {
            return new PineappleWaterIceCream();
        } else if (flavor.equals("Mango")) {
            return new MangoWaterIceCream();
        } else if (flavor.equals("Guava")) {
            return new GuavaWaterIceCream();
        }
        return null;
    }

    /**
     * Creates yogurt-based IceCream object with selected flavor.
     * @param flavor selected
     * @return new IceCream object
     */
    public IceCream createYogurtIceCream(final String flavor) {

        if (flavor.equals("Strawberry")) {
            return new StrawberryYogurtIceCream();
        } else if (flavor.equals("Pineapple")) {
            return new PineappleYogurtIceCream();
        } else if (flavor.equals("Mango")) {
            return new MangoYogurtIceCream();
        } else if (flavor.equals("Guava")) {
            return new GuavaYogurtIceCream();
        }
        return null;
    }

    /**
     * Prepares IceCream of selected flavor.
     * @param flavor selected
     */
    public void prepareCone(final String flavor) {
        IceCream iceCream = createIceCream(flavor);
        Cone cone = new Cone();

        cone.prepare();
        cone.addIceCream(iceCream);
        cone.serve();

    }

    /**
     * IceCream object creation.
     * @param flavor selected
     * @return new IceCream object
     */
    public abstract IceCream createIceCream(String flavor);

}
