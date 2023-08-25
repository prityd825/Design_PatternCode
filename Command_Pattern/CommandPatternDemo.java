/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command_Pattern;

/**
 *
 * @author HP
 */
public class CommandPatternDemo {
    public static void main(String[] args){
        Stock A = new Stock();
        
        BuyStock buyStock = new BuyStock(A);
        SellStock sellStock = new SellStock(A);
        
        
        Broker broker = new Broker();
        broker.TakeOrder(buyStock);
        broker.TakeOrder(sellStock);
        
        broker.PlaceOrder();
    }
    
}
