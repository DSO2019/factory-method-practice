package mx.iteso.icecreams;

import mx.iteso.Cone;

import java.util.ArrayList;


/**
 * Created by Margarita Jauregui
 * date: Nov 5, 2019
 */
public abstract class IceCream {
    public String flavor;
    public String base;
    public ArrayList toppings = new ArrayList();

    public void serve() {
        System.out.println("Serving...");
    }

    public void prepare(){
        System.out.println("Preparing " + this.getBase() + "-" + this.getFlavor() + " ice cream");
        System.out.println("Adding toppings...");
        for (int i = 0; i < toppings.size(); i++){
            System.out.println("    " + toppings.get(i));
        }
    }

    public String getFlavor(){
        return this.flavor;
    }

    public String getBase(){
        return this.base;
    }
}
