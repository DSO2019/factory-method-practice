package mx.iteso.stores;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.IceCream;
import mx.iteso.icecreams.yougurt.*;

public class YougurtIceCreamStore extends IceCreamStore {
    @Override
    protected IceCream createIceCream(String flavor){
        if(flavor.equals("Strawberry")){
            return new StrawberryYougurtIceCream();
        } else if (flavor.equals("Pineapple")){
            return new PineappleYougurtIceCream();
        } else if (flavor.equals("Mango")){
            return new MangoYougurtIceCream();
        } else if (flavor.equals("Guava")){
            return new GuavaYougurtIceCream();
        }
        return null;
    }
}