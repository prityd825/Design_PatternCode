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
public class Paypal extends PaymentProcessor{

    public Paypal(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    void pay(int amount) {
        System.out.println("Paypal Processor :");
        paymentMethod.makePayment(amount);
    }
    
}
