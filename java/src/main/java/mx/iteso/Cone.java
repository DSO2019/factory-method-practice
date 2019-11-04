package mx.iteso;

import mx.iteso.icecreams.IceCream;

import java.util.ArrayList;

/**
 * Clase cono.
 */
public class Cone {
    /**
     * Bolas de nieves del cono.
     */
    private ArrayList<IceCream> icecreams = new ArrayList<IceCream>();

    /**
     * Preparar un cono.
     */
    public final void prepare() {
        System.out.print("Makinh the cone... yummy");
    }

    /**
     * Añadir Nieve.
     * @param iceCream helado a agregar.
     */
    public final void addIceCream(final IceCream iceCream) {
        icecreams.add(iceCream);
    }

    /**
     * Servir cono.
     */
    public final void serve() {
        System.out.print("Serving...");
    }

    /**
     * Get a cone.
     * @return nieve del cono.
     */
    public final String getCone() {
        String ic = "";
        for(int i = 0; i < icecreams.size(); i++){
            ic += icecreams.get(i).getName();
        }
        return ic;
    } 
}
