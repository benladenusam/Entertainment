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
public class Baby extends Bicycle{
    
    String color;
    
    public Baby(String name, int currentSpeed, String type, int mass, int passQuantity, int meansTransmissionMovementQuantity, String color) {
        super(name, currentSpeed, type, mass, passQuantity, meansTransmissionMovementQuantity);
        this.color = color;
    }
    
    String getColor(){
        return color;
    }
    
}
