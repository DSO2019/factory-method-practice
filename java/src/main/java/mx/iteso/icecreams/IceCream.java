package mx.iteso.icecreams;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/17/13
 * Time: 2:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class IceCream {
        /** Sabor del helado. */
        private String flavor;

        /**
         * @param newFlavor nuevo sabor.
         */
        public void setFlavor(final String newFlavor) {
            this.flavor = newFlavor;
        }
        /**
         * @return sabor actual.
         */
        public String getFlavor() {
            return this.flavor;
        }
}
