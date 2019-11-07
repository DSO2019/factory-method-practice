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
     * String to use as ice cream flavor.
      */
    private String flavor;

    /**
     *
     * @param flavor2 adds ice cream flavor.
     */
    public void setFlavor(final String flavor2) {
        this.flavor = flavor2;
    }

    /**
     * @return ice cream flavor.
     */
    public String getFlavor() {
        return flavor;
    }
}
