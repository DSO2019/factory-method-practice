package mx.iteso;
import mx.iteso.icecreams.IceCream;

/**
 * Preparación de cono.
 */
public class Cone {
    /**
     * Factory del metodo.
     */
    private IceCream iceCreamflavor;
    /**
     * Preparar.
     */
    public void prepare() {
        System.out.println("Preparing ice cream for the customer");
    }

    /**
     * Aqui añadimos el sabor que deseamos.
     * @param iceCream llama a helado de leche/agua
     */
    public void addIceCream(final IceCream iceCream) {
        iceCreamflavor = iceCream;
        System.out.println("Adding " + iceCream.getFlavor());
    }

    /**
     * Servimos a cliente.
     */
    public void serve() {
        System.out.println("Serve icecream to the customer");
    }

    /**
     * Obtener sabor.
     * @return iceCreamFlavor
     */
    public IceCream getFlavor() {
        return iceCreamflavor;
    }
}
