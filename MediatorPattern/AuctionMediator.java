/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MediatorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class AuctionMediator implements Mediator{
    
  private List<Buyer> buyers;

    public AuctionMediator() {
        buyers = new ArrayList<>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
        System.out.println(buyer.getName() + " has been added successfully.");
    }

    @Override
    public void findWinner() {
        int maxBid = 0;
        Buyer winner = null;

        for (Buyer buyer : buyers) {
            if (buyer.getBid() > maxBid) {
                maxBid = buyer.getBid();
                winner = buyer;
            }
        }

        if (winner != null) {
            System.out.println("The winner is " + winner.getName());
            notifyBuyers("The auction is over. Received by " + winner.getName());
        }
    }

    private void notifyBuyers(String message) {
        for (Buyer buyer : buyers) {
            buyer.receiveMessage(message);
        }
    }
}
