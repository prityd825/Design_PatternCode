/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MediatorPattern;

/**
 *
 * @author HP
 */
public class IndianBuyer extends Buyer{
    
    public IndianBuyer(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    protected int convertToTaka(int bid) {
        // Conversion logic from INR to Taka
        return (int) (bid * 1.2);
    }
    
    
}
