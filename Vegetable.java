
package Actividad1Semana1;
/**
 * Respresenta las caracteristicas propias de un vegetal determinado.
 * @author Edwin Espinel Munevar.
 */
public class Vegetable {
    /**
     * Nombre del producto.
     */
    public String name;
    /**
     * Productor o proveedor.
     */
    private String supplier;
    /**
     * Peso promedio del producto.
     */
    private float averageWeight;
    
    /**
     * Crea una instancia de la clase Vegetable.
     * @param name Nombre del producto.
     * @param supplier Proveedor o productor.
     * @param averageWeight Peso promedio del producto.
     */
    public Vegetable(String name, String supplier, float averageWeight) {
        this.name = name;
        this.supplier = supplier;
        this.averageWeight = averageWeight;
    }
    
    /**
     * Returna el nombre del objeto creado.
     * @return Nombre del producto.
     */

    public String getName() {
        return name;
    }
    
    /**
     * Captura el nombre del objeto.
     * @param name Nombre del producto.
     */
    public void setName(String name) {
        this.name = name;
    }
}
