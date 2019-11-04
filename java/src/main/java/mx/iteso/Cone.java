package mx.iteso;

import mx.iteso.icecreams.IceCream;

/**
 * Cone class.
 */
public class Cone {
/**
 * IceCream variable.
 */
private IceCream iC;
/**
 * Prepare method.
 */
public String prepare() {
System.out.println("Preparing cone");
return "Preparing cone";
}
/**
 * Adding ice cream method.
 * @param iceCream ice cream.
 */
public void addIceCream(final IceCream iceCream) {
this.iC = iceCream;
}
/**
 * Serving method.
 */
public String serve() {
System.out.println("Serving..." + iC.getName());
return "Serving..." + iC.getName();
}
/**
 * @return ice cream. Get ice cream method.
 */
public IceCream getIceCream() {
return iC;
}
}
