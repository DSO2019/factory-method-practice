package mx.iteso.icecreams;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/17/13
 * Time: 2:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class IceCream {
    /**
     * Flavor attribute.
     */
    private String flavor;

    /**
     * @param newFlavor the flavor to set
     */
    public void setFlavor(final String newFlavor) {
        this.flavor = newFlavor;
    }

    /**
     * @return the flavor
     */
    public String getFlavor() {
        return this.flavor;
    }
}
