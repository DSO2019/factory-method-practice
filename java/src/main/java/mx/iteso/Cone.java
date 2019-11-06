package mx.iteso;

import mx.iteso.icecreams.IceCream;
import java.util.ArrayList;


/**
Clase cono.
 */
public class Cone {

    /**
    Helado en el cono.
     */
    private ArrayList<IceCream> icecreams = new ArrayList<IceCream>();

    /**
     Prepara cono.
     */
    public void prepare() {

    }

    /**
    Agrega helado.
    @param iceCream helado a agregar.
     */
    public void addIceCream(final IceCream iceCream) {
        icecreams.add(iceCream);
    }
    /**
    Sirve cono.
     */
    public void serve() {

    }

    /**
    Metodo para comparar conos.
    @return cadena de helados.
     */
    public String getCone() {
        String ices = "";
        for (int i = 0; i < icecreams.size(); i++) {
            ices += icecreams.get(i).getName();
        }
        return ices;
    }
}
