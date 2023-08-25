/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design_Pattern.AbstractFactory;


public class Main {
    public static void main(String[] args) {
        AbstractFactory normalvehicle = FactoryProducer.getFactory("NormalVehicle");
        AbstractFactory electricvehicle = FactoryProducer.getFactory("ElectricVehicle");
        
        Vehicle car1 = normalvehicle.getVehicle("SUV");
        car1.assemble();
        
        Vehicle car2 = electricvehicle.getVehicle("ElectricSUV");
        car2.assemble();
        
    }
    
}
