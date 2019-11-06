package mx.iteso;

import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.milk.GuavaMilkIceCream;
import mx.iteso.icecreams.milk.MangoMilkIceCream;
import mx.iteso.icecreams.milk.PineappleMilkIceCream;
import mx.iteso.icecreams.milk.StrawberryMilkIceCream;

/**
Clase tienda de helados de leche.
 */
public class MilkIceCreamStore extends IceCreamStore {

    /**
    Método para crea helados de leche.
    @param flavour sabor.
    @return objeto helado.
     */
    public IceCream createIceCream(final String flavour) {
        if (flavour.equals("Strawberry")) {
            return new StrawberryMilkIceCream();
        } else if (flavour.equals("Pineapple")) {
            return new PineappleMilkIceCream();
        } else if (flavour.equals("Mango")) {
            return new MangoMilkIceCream();
        } else if (flavour.equals("Guava")) {
            return new GuavaMilkIceCream();
        }
        return null;
    }
}
