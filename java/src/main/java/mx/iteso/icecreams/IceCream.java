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
     * Sabor del helado.
     */
    private String flavor;

    /**
     * Darle el sabor al helado.
     * @param flavorChoosed para poder settear el sabor.
     */
    public void setFlavor(final String flavorChoosed) {
        this.flavor = flavorChoosed;
    }

    /**
     * Getter del sabor.
     * @return sabor.
     */
    public String getFlavor() {
        return this.flavor;
    }
}
