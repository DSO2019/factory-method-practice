package mx.iteso.icecreams;

import java.util.ArrayList;


/**
 * Created by Margarita Jauregui.
 * date: Nov 5, 2019
 */
public abstract class IceCream {
    /**
     * IceCream flavor.
     */
    private String flavor;
    /**
     * IceCream base.
     */
    private String base;
    /**
     * Toppings added.
     */
    private final ArrayList toppings = new ArrayList();

    /**
     * Serve method.
     */
    public void serve() {
        System.out.println("Serving...");
    }

    /**
     * Prepare and serve ice cream.
     */
    public void prepare() {
        System.out.println("Preparing " + this.getBase() + "-"
                + this.getFlavor() + " ice cream");
        System.out.println("Adding toppings...");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("    " + toppings.get(i));
        }
    }

    /**
     * Getter method for flavor.
     * @return flavor
     */
    public String getFlavor() {
        return this.flavor;
    }

    /**
     * Getter method for base.
     * @return base
     */
    public String getBase() {
        return this.base;
    }

    /**
     * Setter method for flavor.
     * @param newFlavor to use
     */
    public void setFlavor(final String newFlavor) {
        this.flavor = newFlavor;
    }

    /**
     * Adder method.
     * @param topping new topping
     */
    public void addTopping(final String topping) {
        this.toppings.add(topping);
    }

    /**
     * Getter for toppings.
     * @return toppings
     */
    public ArrayList getToppings() {
        return toppings;
    }
}
