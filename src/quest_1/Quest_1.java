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
public class Quest_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Satellite a = new Satellite("Alpha", 27000, "Satellite", 22, 0, 5, 36);
        Exploratory b = new Exploratory("Omega", 14000, "Exploratory", 15, 5, 3, 22);
        Common c = new Common("Mountain", 50, "Common", 2, 1, 2, true);
        Baby d = new Baby("Pacman", 12, "Baby", 1, 0, 4, "Pink");
        
        a.showName();
        System.out.println("Current Speed:" + a.getSpeed());
        System.out.println("Type:" + a.getType());
        System.out.println("Mass:" + a.getMass());
        System.out.println("Passanger Quantity:" + a.getPassQuantity());
        System.out.println("Means Transmission Movement Quantity:" + a.getMeansTransmissionMovementQuantity());
        System.out.println("Orbit Radius:" + a.getOrbitRadius());
        
        System.out.println("****************************");
        
        b.showName();
        System.out.println("Current Speed:" + b.getSpeed());
        System.out.println("Type:" + b.getType());
        System.out.println("Mass:" + b.getMass());
        System.out.println("Passanger Quantity:" + b.getPassQuantity());
        System.out.println("Means Transmission Movement Quantity:" + b.getMeansTransmissionMovementQuantity());
        System.out.println("Orbit Radius:" + b.getExploreSpeed());
        
        System.out.println("****************************");
        
        c.showName();
        System.out.println("Current Speed:" + c.getSpeed());
        System.out.println("Type:" + c.getType());
        System.out.println("Mass:" + c.getMass());
        System.out.println("Passanger Quantity:" + c.getPassQuantity());
        System.out.println("Means Transmission Movement Quantity:" + c.getMeansTransmissionMovementQuantity());
        System.out.println("Orbit Radius:" + c.getAmortizated());
        
        System.out.println("****************************");
        
        d.showName();
        System.out.println("Current Speed:" + d.getSpeed());
        System.out.println("Type:" + d.getType());
        System.out.println("Mass:" + d.getMass());
        System.out.println("Passanger Quantity:" + d.getPassQuantity());
        System.out.println("Means Transmission Movement Quantity:" + d.getMeansTransmissionMovementQuantity());
        System.out.println("Orbit Radius:" + d.getColor());
    }
    
}
