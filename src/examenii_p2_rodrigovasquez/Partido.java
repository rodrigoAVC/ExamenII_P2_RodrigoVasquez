package examenii_p2_rodrigovasquez;

/**
 *
 * @author Rui
 */
public class Partido {
    
    private String equipo1, equipo2;
    private int puntosEquipo1, puntosEquipo2;

    public Partido(String equipo1, String equipo2, int puntosEquipo1, int puntosEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.puntosEquipo1 = puntosEquipo1;
        this.puntosEquipo2 = puntosEquipo2;
    }

    public Partido() {
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public int getPuntosEquipo1() {
        return puntosEquipo1;
    }

    public void setPuntosEquipo1(int puntosEquipo1) {
        this.puntosEquipo1 = puntosEquipo1;
    }

    public int getPuntosEquipo2() {
        return puntosEquipo2;
    }

    public void setPuntosEquipo2(int puntosEquipo2) {
        this.puntosEquipo2 = puntosEquipo2;
    }

    @Override
    public String toString() {
        return '[' +equipo1  + " VS " + equipo2 + ']' + " -> [" + puntosEquipo1 + " - " + puntosEquipo2 + ']';
    }
    
    
}
