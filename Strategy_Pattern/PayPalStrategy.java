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
public class PayPalStrategy implements PaymentStrategy{
    
    private String emailId;
    private String Password;
    public PayPalStrategy(String emailId, String Password){
        this.emailId=emailId;
        this.Password=Password;
        //System.out.println("Email: "+this.emailId);
        //System.out.println("Password:"+this.Password);
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount+"Paid with paypal");
    }
    
}
