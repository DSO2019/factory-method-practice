import mx.iteso.Cone;

import mx.iteso.IceCreamStore;
import mx.iteso.Stores.MilkIceCreamStore;
import mx.iteso.Stores.WaterIceCreamStore;
import mx.iteso.Stores.YogurtIceCreamStore;

/**
 * Class created to test the ice Creams.
 */
public final class IceCreamTest {
    /**
     * ice cream constructor.
     */
    private IceCreamTest() {
    }

    /**
     *
     * @param args arguments created by main, not used.
     */
    public static void main(final String[] args) {
        IceCreamStore milk = new MilkIceCreamStore();
        IceCreamStore water = new WaterIceCreamStore();
        IceCreamStore yogurt = new YogurtIceCreamStore();

        System.out.println();

        Cone cone = water.prepareCone("Water", "Mango");
        System.out.printf("Cono preparado de:%s\n\n",
                cone.getIceCream().getFlavor());

        cone = yogurt.prepareCone("yogurt", "Pineapple");
        System.out.printf("El segundo cono es de: %s\n\n",
                cone.getIceCream().getFlavor());

        cone = milk.prepareCone("milk", "Guava");
        System.out.printf("El tercer cono es de: %s\n\n",
                cone.getIceCream().getFlavor());
    }
}
