/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design_Pattern.Builder;

/**
 *
 * @author TANIM
 */
public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setModel("Sedan")
                .setEngine("V6")
                .setHasGPS(true)
                .setHasBluetooth(true)
                .setInteriorColor("Black") 
                .build();

        // Use the built car object
        System.out.println("Model: " + car.getModel());
        System.out.println("Engine: " + car.getEngine());
        System.out.println("Has GPS: " + car.hasGPS());
        System.out.println("Has Bluetooth: " + car.hasBluetooth());
        System.out.println("Interior Color: " + car.getInteriorColor());
    }
    
}
