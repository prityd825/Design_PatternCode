/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MediatorPattern;

/**
 *
 * @author HP
 */
abstract class Buyer {
      private String name;
    private int bid;
    private Mediator mediator;

    public Buyer(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBid() {
        return bid;
    }

    public void bid(int bid) {
        this.bid = convertToTaka(bid);
        System.out.println(name + " placed a bid of " + this.bid + " Taka.");
    }

    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }

    protected abstract int convertToTaka(int bid);
}

