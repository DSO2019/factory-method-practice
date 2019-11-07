package mx.iteso;

public class Cone {

    /**
     * New Icecreame Cone
     */
    private IceCream ic;

    /**
     * Prepare cone metoth
     */
    public void prepare() {
         System.out.println("Preparing a cone");
    }

    /**
     *
     * @param iceCream
     */
    public void addIceCream(IceCream iceCream) {
        this.ic = iceCream;
    }

    /**
     * Serve ic on cone
     */
    public void serve() {
        System.out.println("Sirviendo ");
    }

    /**
     *
     * @return ic
     */
    public IceCream getIcecream(){
        return this.ic;
    }
}
