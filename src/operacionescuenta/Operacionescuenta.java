/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionescuenta;

/**
 *
 * @author carlos
 */
public class Operacionescuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuenta cuenta1 = new Cuenta(133, 2, "Carlos");
        Cuenta cuenta2 = new Cuenta(123, 10, "Carlos");
       
        cuenta1.Transferencia(cuenta2);
        cuenta2.ConsultarSaldo();
        cuenta1.ConsultarSaldo();
        
        
        // TODO code application logic here
    }
    
}
