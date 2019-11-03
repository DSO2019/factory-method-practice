import mx.iteso.Cone;
import mx.iteso.IceCreamStore;
import mx.iteso.stores.MilkIceCreamStore;
import mx.iteso.stores.WaterIceCreamStore;
import mx.iteso.stores.YougurtIceCreamStore;

/**
 * Ice Cream Test Drive.
 */
public final class IceCreamTestDrive {

    /**
     * Constructor.
     */
    private IceCreamTestDrive() {
    }

    /**
     * Main method.
     * @param args args.
     */
    public static void main(final String[] args) {
        IceCreamStore milkStore = new MilkIceCreamStore();
        IceCreamStore waterStore = new WaterIceCreamStore();
        IceCreamStore yougurtStore = new YougurtIceCreamStore();

        System.out.println();

        Cone cone = milkStore.prepareCone("milk", "Mango");
        System.out.println("First cone is: " + cone.getIceCream().getFlavor());
        System.out.println();

        cone = waterStore.prepareCone("water", "Strawberry");
        System.out.println("Second cone is: " + cone.getIceCream().getFlavor());
        System.out.println();

        cone = yougurtStore.prepareCone("yougurt", "Guava");
        System.out.println("Third cone is: " + cone.getIceCream().getFlavor());
        System.out.println();
    }
}
