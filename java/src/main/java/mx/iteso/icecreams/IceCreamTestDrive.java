package mx.iteso.icecreams;

import mx.iteso.IceCreamStore;
import mx.iteso.icecreams.stores.MilkIceCreamStore;
import mx.iteso.icecreams.stores.WaterIceCreamStore;
import mx.iteso.icecreams.stores.YogurtIceCreamStore;


/**
 * Created by Margarita Jauregui
 * date: Nov 5, 2019
 */
public class IceCreamTestDrive {
    public static void main(String[] args) {
        IceCreamStore waterStore = new WaterIceCreamStore();
        IceCreamStore milkStore = new MilkIceCreamStore();
        IceCreamStore yogurtStore = new YogurtIceCreamStore();

       IceCream waterIceCream = waterStore.createIceCream("Mango");
       System.out.println("First Ice Cream is: " + waterIceCream.getBase() + "-" + waterIceCream.getFlavor());

       IceCream milkIceCream = milkStore.createIceCream("Strawberry");
       System.out.println("Second Ice Cream is: " + milkIceCream.getBase() + "-" + milkIceCream.getFlavor());

       IceCream yogurtIceCream = yogurtStore.createIceCream("Pineapple");
       System.out.println("Third Ice Cream is: " + yogurtIceCream.getBase() + "-" + yogurtIceCream.getFlavor());


    }
}
