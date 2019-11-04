package mx.iteso;

import mx.iteso.factory.Cone;
import mx.iteso.factory.IceCreamStore;
import mx.iteso.factory.stores.MilkIceCreamStore;
import mx.iteso.factory.stores.WaterIceCreamStore;
import mx.iteso.factory.stores.YogurtIceCreamStore;

/** Ice Cream Test Drive class.  */
public final class IceCreamTestDrive {

    /** Constructor. */
    private IceCreamTestDrive() { }

    /** Main method.
     * @param args arguments.
    */
    public static void main(final String[] args) {
        IceCreamStore milkStore = new MilkIceCreamStore();
        IceCreamStore waterStore = new WaterIceCreamStore();
        IceCreamStore yougurtStore = new YogurtIceCreamStore();

        Cone cone = milkStore.prepareCone("Mango");
        System.out.println("Delivered cone: " + cone.getIceCream().getFlavor());
        System.out.println("--------------------------");

        cone = waterStore.prepareCone("Strawberry");
        System.out.println("Delivered cone: " + cone.getIceCream().getFlavor());
        System.out.println("--------------------------");

        cone = yougurtStore.prepareCone("Guava");
        System.out.println("Delivered cone: " + cone.getIceCream().getFlavor());
        System.out.println("--------------------------");
    }
}
