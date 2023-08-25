/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design_Pattern.Strategy_Pattern;

public class creditCardStrategy implements PaymentStrategy{
   private String name;
   private String cardNumber;
   private String cvv;
   private String dateOfExpiry;
   
   public creditCardStrategy(String name, String cardNumber, String cvv, String dateofExpiry){
       this.name=name;
       this.cardNumber=cardNumber;
       this.cvv=cvv;
       this.dateOfExpiry=dateofExpiry;
       
   }


    @Override
    public void pay(double amount) {
        System.out.println(amount+"Paid with Credit card bill");
    }
    
}
