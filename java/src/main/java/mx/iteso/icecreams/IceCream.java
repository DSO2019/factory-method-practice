package mx.iteso.icecreams;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/17/13
 * Time: 2:24 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class IceCream {
    /** Ice Cream Flavor. */
    private String flavor;
    /**
     * @param flavorSelected flavor.
     */
    protected void setFlavor(final String flavorSelected) {
        this.flavor = flavorSelected;
    }
    /**
     * @return flavor.
     */
    public String getFlavor() {
        return this.flavor;
    }
}
