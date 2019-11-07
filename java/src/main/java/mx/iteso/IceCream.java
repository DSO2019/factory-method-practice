package mx.iteso;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/17/13
 * Time: 2:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class IceCream {

    /**
     * Flavor
     */
    private String flavor;

    /**
     *
     * @param pickedFlavor
     */
    protected void setFlavor(final String pickedFlavor){
        this.flavor = pickedFlavor;
    }

    /**
     *
     * @return flavor
     */
    public String getFlavor(){
        return this.flavor;
    }
}
