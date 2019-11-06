package mx.iteso.icecreams;

/**
 * Abstract
 */
public abstract class IceCream {
    /**
     * flavor String.
     */
    private String flavor;

    /**
     * set flavor.
     * @param flavor flavor passed
     */
    protected void setFlavor(final String flavor) {
        this.flavor = flavor;
    }

    /**
     * @return flavor.
     */
    public String getFlavor() {
        return this.flavor;
    }
}
