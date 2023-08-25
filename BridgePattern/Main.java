/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design_Pattern.BridgePattern;

/**
 *
 * @author TANIM
 */
public class Main {
    public static void main(String[] args) {
        PaymentMethod nagad = new Nagad();
        PaymentMethod bkash = new Bkash();
        
        PaymentProcessor paypal = new Paypal(bkash);
        paypal.pay(1000);
    }
    
}
