/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design_Pattern.Strategy_Pattern;

/**
 *
 * @author TANIM
 */
public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new creditCardStrategy("ABC","1234","1","5th June");
        PaymentStrategy paypal = new PayPalStrategy("tahsinahmed.iit@gmail.com","123456");
        
        ShoppingCart shopping = new ShoppingCart();
        shopping.setPaymentStrategy(paypal);
        shopping.checkout(100);
        
        
        shopping.setPaymentStrategy(creditCard);
        shopping.checkout(200);
    }
}
