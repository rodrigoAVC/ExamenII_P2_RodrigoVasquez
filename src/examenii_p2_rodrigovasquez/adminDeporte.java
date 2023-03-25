package examenii_p2_rodrigovasquez;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Rui
 */
public class adminDeporte {
    
    private ArrayList<Deporte> deportes = new ArrayList();
    private File file = null;
    
    public adminDeporte(String path) {
        file = new File(path);
    }

    public ArrayList<Deporte> getDeportes() {
        return deportes;
    }

    public void setDeportes(ArrayList<Deporte> deportes) {
        this.deportes = deportes;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "adminDeporte{" + "deportes=" + deportes + ", file=" + file + '}';
    }
    
    public void cargar() {
        
    }
    
    public void escribir() {
        
    }
}
