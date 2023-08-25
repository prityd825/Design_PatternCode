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
public class Car {
    private String model;
    private String engine;
    private boolean hasGPS;
    private boolean hasBluetooth;
    private String interiorColor;

    public Car(String model, String engine, boolean hasGPS, boolean hasBluetooth, String interiorColor) {
        this.model = model;
        this.engine = engine;
        this.hasGPS = hasGPS;
        this.hasBluetooth = hasBluetooth;
        this.interiorColor = interiorColor;
    }

    String getModel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getEngine() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String hasGPS() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String hasBluetooth() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getInteriorColor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
