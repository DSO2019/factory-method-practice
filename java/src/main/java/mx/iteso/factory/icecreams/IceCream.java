package mx.iteso.factory.icecreams;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/17/13
 * Time: 2:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class IceCream {

    /** Ice Cream Flavor. */
    private String flavor;

    /**
     * Flavor setter method.
     * @param flavorSelected Desired flavor.
     */
    public void setFlavor(final String flavorSelected) {
        this.flavor = flavorSelected;
    }

    /**
     * Flavor getter method.
     * @return Current flavor.
     */
    public String getFlavor() {
        return this.flavor;
    }
}
