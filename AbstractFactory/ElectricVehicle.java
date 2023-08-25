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
public class ElectricVehicle extends AbstractFactory{

    @Override
    public Vehicle getVehicle(String vehicle) {
        if(vehicle.equalsIgnoreCase("ElectricBMW")){
            return new ElectricBMW();
        }else if(vehicle.equalsIgnoreCase("ElectricSUV")){
            return new ElectricSUV();
        }
        return null;
    }



    
    
}
