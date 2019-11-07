package mx.iteso.icecreams.stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;


/**
 * Created by Margarita Jauregui
 * date: Nov 5, 2019
 */
public class WaterIceCreamStore extends IceCreamStore {
    String base = "water";
    @Override
    public IceCream createIceCream(String flavor) {
        IceCream waterIceCream = createWaterIceCream(flavor);
        return waterIceCream;
    }

    public void setBase(String base){
        this.base = base;
    }

    public String getBase() {
        return this.base;
    }
}
