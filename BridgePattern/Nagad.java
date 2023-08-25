/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design_Pattern.BridgePattern;

public class Nagad implements PaymentMethod{

    @Override
    public void makePayment(int amount) {
        System.out.println(amount+"paid with Nagad");
    }
    
}
