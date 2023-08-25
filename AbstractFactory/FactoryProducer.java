/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design_Pattern.AbstractFactory;

/**
 *
 * @author TANIM
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("NormalVehicle")){
            return new NormalVehicle();
        }else if(factory.equalsIgnoreCase("ElectricVehicle")){
            return new ElectricVehicle();
        }
        return null;
    }
}
