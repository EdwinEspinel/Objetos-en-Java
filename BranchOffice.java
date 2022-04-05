
package Actividad1Semana1;
/**
 * Respresenta las caracteristicas de una sucursal.
 * @author Edwin Espinel Munevar.
 */
import java.util.ArrayList;

public class BranchOffice {
    /**
     * Nombre de la sucursal.
     */
    public String name;
    /**
     * Dirección de la sucursal.
     */
    public String direction;
    /**
     * Nombre del generente de la sucursal.
     */
    private String manager;
    /**
     * Lista de nombres de los vendedores de la sucursal.
     */
    public ArrayList<String> NameEmployee = new ArrayList();
    
    /**
     * Crea una instancia de la clase BranchOffice.
     * @param name Nombres de la sucursal.
     * @param direction Direccion de la sucursal.
     * @param manager Nombre del generente.
     */
    public BranchOffice(String name, String direction, String manager) {
        this.name = name;
        this.direction = direction;
        this.manager = manager;
    }
    /**
     * Retorna la lista de empleados.
     * @return 
     */
    public ArrayList<String> getNameEmployee() {
        return NameEmployee;
    }
    /**
     * Captura los nombres de los empeados o vendedores.
     * @param NameEmployee 
     */
    public void setNameEmployee(ArrayList<String> NameEmployee) {
        this.NameEmployee = NameEmployee;
    }
    
}
