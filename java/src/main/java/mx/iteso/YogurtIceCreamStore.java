package mx.iteso;

import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.yogurt.GuavaYogurtIceCream;
import mx.iteso.icecreams.yogurt.MangoYogurtIceCream;
import mx.iteso.icecreams.yogurt.PineappleYogurtIceCream;
import mx.iteso.icecreams.yogurt.StrawberryYogurtIceCream;

/**
Clase tienda de helados de yogurt.
 */
public class YogurtIceCreamStore extends IceCreamStore {

    /**
    Método para crear helado de yogurt.
    @param flavour sabor.
    @return objeto helado.
     */
    public IceCream createIceCream(final String flavour) {
        if (flavour.equals("Strawberry")) {
            return new StrawberryYogurtIceCream();
        } else if (flavour.equals("Pineapple")) {
            return new PineappleYogurtIceCream();
        } else if (flavour.equals("Mango")) {
            return new MangoYogurtIceCream();
        } else if (flavour.equals("Guava")) {
            return new GuavaYogurtIceCream();
        }
        return null;
    }
}
