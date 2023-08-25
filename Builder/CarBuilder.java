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
public class CarBuilder {
    private String model;
    private String engine;
    private boolean hasGPS;
    private boolean hasBluetooth;
    private String interiorColor;

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
        return this;
    }

    public CarBuilder setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
        return this;
    }

    public CarBuilder setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
        return this;
    }

    public Car build() {
        return new Car(model, engine, hasGPS, hasBluetooth, interiorColor);
    }
}
