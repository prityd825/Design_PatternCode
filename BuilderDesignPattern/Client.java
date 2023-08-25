/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderDesignPattern;

/**
 *
 * @author HP
 */
public class Client {
    public static void main(String[] args){
        System.out.println("    Builder Patter Demo   \n");
        
        Director director = new Director();
        BuilderInterface carBuilder = new Car();
        BuilderInterface motorBuilder = new MotorCycle();
        
        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();
        
        /*director.construct(motorBuilder);
        Product p2 = new motorBuilder.getVehicle();
        p2.show();*/
    }
}
