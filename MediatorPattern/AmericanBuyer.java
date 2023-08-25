/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MediatorPattern;

/**
 *
 * @author HP
 */
public class AmericanBuyer extends Buyer {
   
     public AmericanBuyer(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    protected int convertToTaka(int bid) {
        // Conversion logic from USD to Taka
        return bid * 110;
    }
    
}
