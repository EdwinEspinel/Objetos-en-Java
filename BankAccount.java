
package Actividad1Semana1;
/**
 * Respresenta las caracteristicas de la cuenta bancaria con la que se desea realizar un pago.
 * @author Edwin Espinel Munevar.
 */
public class BankAccount {
    /**
     * Numero de cuenta bancaria.
     */
    private int accountNumber;
    /**
     * Estado de la cuenta bancaria.
     */
    protected boolean activated;
    
    /**
     * Crea una instancia de la clase BankAccount.
     * @param accountNumber Numero de la cuenta.
     * @param activated Estado de la cuenta.
     */
    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    /**
     * Captura el estado de la cuenta.
     * @param activated 
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    /**
     * Retorna el estado de la cuenta.
     * @return 
     */
    public boolean isActivated() {
        return activated;
    }
    
}
