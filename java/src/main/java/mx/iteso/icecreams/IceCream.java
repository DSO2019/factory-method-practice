package mx.iteso.icecreams;

/**
 * Abstract class IceCream.
 */
public abstract class IceCream {
    /**
     * Flavor.
     */
    private String flavor;

    /**
     * @param pickedFlavor flavor.
     */
    protected void setFlavor(final String pickedFlavor) {
        this.flavor = pickedFlavor;
    }

    /**
     * @return flavor.
     */
    public String getFlavor() {
        return this.flavor;
    }
}
