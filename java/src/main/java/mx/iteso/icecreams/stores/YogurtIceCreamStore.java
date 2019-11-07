package mx.iteso.icecreams.stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;


/**
 * Created by Margarita Jauregui
 * date: Nov 5, 2019
 */
public class YogurtIceCreamStore extends IceCreamStore {
    String base = "yogurt";
    public IceCream createIceCream(String flavor){
        IceCream yogurtIceCream = createYogurtIceCream(flavor);
        return yogurtIceCream;
    }

    public void setBase(String base){
        this.base = base;
    }

    public String getBase() {
        return this.base;
    }
}
