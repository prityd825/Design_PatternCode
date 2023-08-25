/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MediatorPattern;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new AuctionMediator();

        Buyer b1 = new AmericanBuyer(mediator, "Elon Mask");
        Buyer b2 = new BangladeshiBuyer(mediator, "Shakib");
        Buyer b3 = new IndianBuyer(mediator, "Virat");

        mediator.addBuyer(b1);
        mediator.addBuyer(b2);
        mediator.addBuyer(b3);

        b1.bid(50);
        b2.bid(9000);
        b3.bid(5000);

        mediator.findWinner();
    }
    
}
