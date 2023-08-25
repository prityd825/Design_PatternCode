/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design_Pattern.AbstractFactory;

public class NormalVehicle extends AbstractFactory{

    @Override
    public Vehicle getVehicle(String vehicle) {
        if(vehicle.equalsIgnoreCase("SUV")){
            return new SUV();
        }else if(vehicle.equalsIgnoreCase("BMW")){
            return new BMW();
        }
        return null;
    }
    
}
