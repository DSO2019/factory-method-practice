package mx.iteso.icecreams.stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;

/**
 * Created by Margarita Jauregui
 * date: Nov 5, 2019
 */
public class MilkIceCreamStore extends IceCreamStore {
    String base = "milk";

    @Override
    public IceCream createIceCream(String flavor){
        IceCream milkIceCream = createMilkIceCream(flavor);
        return milkIceCream;
    }

    public void setBase(String base){
        this.base = base;
    }

    public String getBase() {
        return this.base;
    }
}
