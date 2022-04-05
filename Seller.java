
package Actividad1Semana1;
/**
 * Represtenta algunas caracteristicas de los vendedores.
 * @author Edwin Espinel Munevar.
 */
import java.util.Date;

public class Seller {
    /**
     * Nombre del vendedor.
     */
    public String name;
    /**
     * Primer apellido del vendedor.
     */
    public String lastName1;
    /**
     * Segundo apellido del vendedor.
     */
    public String lastName2;
    /**
     * Fecha de nacimiento.
     */
    public Date dateBirth;
    /**
     * Crea una instancia de la clase Seller.
     * @param name Nombre del vendedor
     * @param lastName1 Primer apellido del vendedor.
     * @param lastName2 Segundo apellido del vendedor.
     * @param dateBirth Fecha de nacimiento del vendedor.
     */
    public Seller(String name, String lastName1, String lastName2, Date dateBirth) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
    }
    /**
     * Returna el nombre del vendedor.
     * @return Nombre del producto.
     */
    public String getName() {
        return name;
    }
    /**
     * Captura el nombre del vendedor.
     * @param name Nombre del producto.
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
