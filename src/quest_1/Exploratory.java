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
public class Exploratory extends Rocket {
    
    int exploreSpeed;
    
    public Exploratory(String name, int currentSpeed, String type, int mass, int passQuantity, int meansTransmissionMovementQuantity, int exploreSpeed) {
        super(name, currentSpeed, type, mass, passQuantity, meansTransmissionMovementQuantity);
        this.exploreSpeed = exploreSpeed;
    }
    
    public int getExploreSpeed(){
        return exploreSpeed;
    }
    
}
