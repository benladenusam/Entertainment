/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest_1;

import java.io.*;
import java.util.*;

/**
 *
 * @author m-sev
 */
public class Quest_1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    static final File FILE = new File("Output.txt");
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String path = "C:\\Users\\m-sev\\Desktop\\Zavd\\Quest_1\\src\\quest_1\\Input.txt"; 
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
        System.out.println("\n");

        List<Mashine> list = new ArrayList<>();
        List<String> carsParam = new ArrayList<String>();
        
        FileReader fr = new FileReader(path);
        Scanner scan = new Scanner(fr);
        
        String lol;
        while(scan.hasNextLine()){
            lol = scan.nextLine();
            if(lol.length() != 0){
                carsParam.add(lol);
            }
        }
        for(String key : carsParam){
            String[] param = key.split("\\s+");

            if(param[0].equals("1")){
                list.add(new Rocket(param[1], Integer.parseInt(param[2]), param[3], Integer.parseInt(param[4]), Integer.parseInt(param[5]), Integer.parseInt(param[6])));
            } else if(param[0].equals("2")){
                list.add(new Bicycle(param[1], Integer.parseInt(param[2]), param[3], Integer.parseInt(param[4]), Integer.parseInt(param[5]), Integer.parseInt(param[6])));
            }
        }
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        
        list.sort(null);
        
        PrintWriter out = new PrintWriter(FILE.getAbsoluteFile());
        
        
        try {
            if(!FILE.exists()){
                FILE.createNewFile();
        }
 
        try {
            //Записываем текст у файл
            for(Mashine mashine : list){
            out.println(mashine.getCarName() +":    "+ mashine.getCurrentSpeed());
            }
        } finally {
            out.close();
        }
    } catch(IOException e) {
        throw new RuntimeException(e);
    }
               
        
    }  
}
