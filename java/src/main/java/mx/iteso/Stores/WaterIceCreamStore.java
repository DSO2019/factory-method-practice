package mx.iteso.Stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.water.GuavaWaterIceCream;
import mx.iteso.icecreams.water.MangoWaterIceCream;
import mx.iteso.icecreams.water.PineappleWaterIceCream;
import mx.iteso.icecreams.water.StrawberryWaterIceCream;


/**
 * Store creates water ice creams.
 */
public class WaterIceCreamStore extends IceCreamStore {
    /**
     *
     * @param flavor adds flavor to created ice cream.
     * @return created ice cream.
     */
    @Override
    protected IceCream createIceCream(final String flavor){
        if(flavor.equals("Strawberry")){
            return new StrawberryWaterIceCream();
        } else if(flavor.equals("Guava")){
            return new GuavaWaterIceCream();
        } else if(flavor.equals("Mango")){
            return new MangoWaterIceCream();
        } else if(flavor.equals("Pineapple")){
            return new PineappleWaterIceCream();
        }
        return null;
    }
}
