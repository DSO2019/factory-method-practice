package mx.iteso;

import mx.iteso.icecreams.IceCream;

public class Cone {
	public IceCream iceCream;
	
    public void prepare() {
    	System.out.println("Preparing cone");
    }

    public void addIceCream(IceCream iceCream) {
    	this.iceCream = iceCream;
    }

    public void serve() {
    	System.out.println("Serving..." + iceCream.name);
    }
}
