/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design_Pattern.AbstractFactory;


public class ElectricBMW implements Vehicle{

    @Override
    public void assemble() {
        System.out.println("This is a Electric BMW Car");
    }
    
}
