    package examenii_p2_rodrigovasquez;

import java.util.ArrayList;

/**
 *
 * @author Rui
 */
public class Deporte {
    
    private String nombre;
    private ArrayList<Torneo> torneos = new ArrayList();

    public Deporte(String nombre) {
        this.nombre = nombre;
    }
    
    public Deporte() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }


    @Override
    public String toString() {
        return nombre;
    }
    
    
}
