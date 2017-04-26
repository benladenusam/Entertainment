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
public class Satellite extends Rocket {
    
    int orbitRadius;

    public Satellite(String name, int currentSpeed, String type, int mass, int passQuantity, int meansTransmissionMovementQuantity, int orbitRadius) {
        super(name, currentSpeed, type, mass, passQuantity, meansTransmissionMovementQuantity);
        this.orbitRadius = orbitRadius;
    }
    
    public int getOrbitRadius(){
        return orbitRadius;
    }
}
