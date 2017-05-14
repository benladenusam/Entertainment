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
abstract class Mashine implements Run, Comparable<Mashine> {
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
    
    public int getCurrentSpeed(){
        return currentSpeed;
    }
    
    @Override
    public String getCarName(){
        return carName;
    }
    
    @Override
    public int compareTo(Mashine comMashine){
        int comSpeed = ((Mashine) comMashine).getCurrentSpeed();
        return this.currentSpeed - comSpeed;
    }
}
