package mx.iteso;

import mx.iteso.icecreams.IceCream;

import java.util.ArrayList;

public class Cone {
    ArrayList<IceCream> icecreams = new ArrayList<IceCream>();

    public void prepare() {
        System.out.print("Makinh the cone... yummy");
    }

    public void addIceCream(IceCream iceCream) {
        icecreams.add(iceCream);
    }

    public void serve() {
        System.out.print("Serving...");
    }
}
