package mx.iteso;

import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.water.GuavaWaterIceCream;
import mx.iteso.icecreams.water.MangoWaterIceCream;
import mx.iteso.icecreams.water.PineappleWaterIceCream;
import mx.iteso.icecreams.water.StrawberryWaterIceCream;

/**
Clase tienda de helados de agua.
 */
public class WaterIceCreamStore extends IceCreamStore {

    /**
    Método para crear helado de agua.
    @param flavour sabor.
    @return objeto helado.
     */
    public IceCream createIceCream(final String flavour) {
        if (flavour.equals("Strawberry")) {
            return new StrawberryWaterIceCream();
        } else if (flavour.equals("Pineapple")) {
            return new PineappleWaterIceCream();
        } else if (flavour.equals("Mango")) {
            return new MangoWaterIceCream();
        } else if (flavour.equals("Guava")) {
            return new GuavaWaterIceCream();
        }
        return null;
    }
}
