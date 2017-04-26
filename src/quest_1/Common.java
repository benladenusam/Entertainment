/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest_1;

/**
 *
 * @author m-sev
 */
public class Common extends Bicycle{
   
    boolean amortizated;
    
    public Common(String name, int currentSpeed, String type, int mass, int passQuantity, int meansTransmissionMovementQuantity, boolean amortizated) {
        super(name, currentSpeed, type, mass, passQuantity, meansTransmissionMovementQuantity);
        this.amortizated = amortizated;
    }
    
    boolean getAmortizated(){
        return amortizated;
    }
}
