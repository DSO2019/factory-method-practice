package mx.iteso.Stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.milk.GuavaMilkIceCream;
import mx.iteso.icecreams.milk.MangoMilkIceCream;
import mx.iteso.icecreams.milk.PineappleMilkIceCream;
import mx.iteso.icecreams.milk.StrawberryMilkIceCream;

/**
 * Store creates milk ice creams.
 */
public class MilkIceCreamStore extends IceCreamStore {
    /**
     *
     * @param flavor adds flavor to created ice cream.
     * @return Ice cream created.
     */
    @Override
    protected IceCream createIceCream(final String flavor){
        if(flavor.equals("Strawberry")){
            return new StrawberryMilkIceCream();
        } else if(flavor.equals("Guava")){
            return new GuavaMilkIceCream();
        } else if(flavor.equals("Mango")){
            return new MangoMilkIceCream();
        } else if(flavor.equals("Pineapple")){
            return new PineappleMilkIceCream();
        }
            return null;
    }
}
