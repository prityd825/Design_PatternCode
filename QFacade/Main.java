/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QFacade;

/**
 *
 * @author HP
 */
public class Main {
    
    public static void main(String[] args){
        
        DebitCard card = new DebitCard();
        String accountNumber = "012-3456-7890";
        int amount = 10000;
        card.withdraw(accountNumber,amount);
        
        
       
    }
    
}
