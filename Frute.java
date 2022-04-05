
package Actividad1Semana1;
/**
 * Respresenta las caracteristicas de una fruta.
 * @author Edwin Espinel Munevar.
 */
import java.util.ArrayList;

public class Frute {
    /**
     * Nombre de la fruta.
     */
    public String name;
    /**
     * Peso promedio de la fruta.
     */
    private float averageWeight;
    /**
     * Lista de los colores de las frutas.
     */
    public ArrayList<String> colors = new ArrayList();
    /**
     * Crea una instancia de la clase Frute
     * @param name Nombre de la fruta.
     * @param averageWeight Peso promedio de la fruta.
     */

    public Frute(String name, float averageWeight) {
        this.name = name;
        this.averageWeight = averageWeight;
    }
    /**
     * Captura el nombre de la fruta.
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Retorna los colores de las frutas.
     * @return 
     */
    public ArrayList<String> getColors() {
        return colors;
    }
    
}
