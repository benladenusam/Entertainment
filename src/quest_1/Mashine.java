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
abstract class Mashine implements Run {
    final int maxSpeed = 160;
    final int minSpeed = 0;
    final int minPassQuantity = 0;
    final int maxPassQuantity = 9; 
    
    String carName;
    protected int currentSpeed;
    
    Mashine(String name, int currentSpeed){
        this.carName = name;
        this.currentSpeed = currentSpeed;
    }
    
    @Override
    public void showName(){
        System.out.println("Transport Name:" + this.carName);
    }
}
