/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MediatorPattern;

/**
 *
 * @author HP
 */
public class BangladeshiBuyer extends Buyer{
    
    public BangladeshiBuyer(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    protected int convertToTaka(int bid) {
        // No conversion needed as the bid is already in Taka
        return bid;
    }
}
