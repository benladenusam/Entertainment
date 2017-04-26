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
public class Bicycle extends Mashine{
    
    String type;
    protected int mass;
    protected int passQuantity;
    protected int meansTransmissionMovementQuantity;
    public Bicycle(String name, int currentSpeed, String type, int mass, int passQuantity, int meansTransmissionMovementQuantity) {
        super(name, currentSpeed);
        this.type = type;
        this.mass = mass;
        this.passQuantity = passQuantity;
        this.meansTransmissionMovementQuantity = meansTransmissionMovementQuantity;
    }

    @Override
    public int getSpeed() {
        return currentSpeed;
    }

    @Override
    public int getMass() {
        return mass;
    }

    @Override
    public int getPassQuantity() {
       return passQuantity;
    }

    @Override
    public int getMeansTransmissionMovementQuantity() {
        return meansTransmissionMovementQuantity;
    }
    
    String getType(){
        return type;
    }
}
