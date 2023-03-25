package examenii_p2_rodrigovasquez;

import java.util.ArrayList;

/**
 *
 * @author Rui
 */
public class Torneo {
    
    private String nombre;
    private ArrayList<Equipo> equipos = new ArrayList();
    private ArrayList<Partido> partidos = new ArrayList();
    private String periodo;

    public Torneo() {
    }

    public Torneo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
