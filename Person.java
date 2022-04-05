
package Actividad1Semana1;
/**
 * Respresenta algunas caracteristicas de una persona o cliente.
 * @author Edwin Espinel Munevar.
 */
import java.util.Date;

public class Person {
    /**
     * Nombres del cliente.
     */
    public String name;
    /**
     * Primer apellido del cliente.
     */
    public String lastName1;
    /**
     * Segundo apellido del cliente.
     */
    public String lastName2;
    /**
     * Fecha de nacimiento del cliente.
     */
    public Date dateBirth;
    /**
     * Estatura del cliente.
     */
    public float height;
    /**
     * Crea una instancia de la clase Person.
     * @param name Nombres del cliente. 
     * @param lastName1 Primer apellido del cliente.
     * @param lastName2 Segundo apellido del cliente.
     * @param dateBirth Fecha de nacimiento del cliente.
     * @param height Estatura del cliente.
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }
    /**
     * Captura el nombre de la persona o cliente.
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Retorna el nombre de la persona o cliente.
     * @return 
     */
    public String getName() {
        return name;
    }
}
