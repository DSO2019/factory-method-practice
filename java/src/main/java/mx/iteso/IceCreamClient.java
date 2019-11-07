package mx.iteso;

import mx.iteso.stores.MilkIceCream;
import mx.iteso.stores.WaterIceCream;
import mx.iteso.stores.YougurthIceCream;

/**
 * Ver como sirven a los clientes.
 */
public final class IceCreamClient {
    /**
     * Evitar error.
     */
    private IceCreamClient() {
    }
    /**
     * Main para realizar los tests.
     * @param args para main
     */
    public static void main(final String[] args) {
        IceCreamStore milkStore = new MilkIceCream();
        IceCreamStore waterStore = new WaterIceCream();
        IceCreamStore yogurthStore = new YougurthIceCream();

        Cone cone = milkStore.serveCone("Strawberry");
        System.out.println("Milk: " + cone.getFlavor().getFlavor());
        System.out.println();

        cone = waterStore.serveCone("Strawberry");
        System.out.println("Water: " + cone.getFlavor().getFlavor());
        System.out.println();

        cone = yogurthStore.serveCone("Strawberry");
        System.out.println("Yogurth " + cone.getFlavor().getFlavor());
        System.out.println();


    }
}
