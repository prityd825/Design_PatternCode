/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Client {
    private DispenseChain c1;
    public Client(){
        this.c1 = new Dollar50();
        DispenseChain c2 = new Dollar20();
        DispenseChain c3 = new Dollar10();
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }
    
    public static void main(String[] args)
    {
        Client atmDispensor = new Client();
        while(true){
            int amount = 0;
            
            System.out.println("Enter amount to dispense ");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            
            if(amount % 10 != 0){
                System.out.println("Amount should be multiple of 10s.");
                return;
            }
            
            atmDispensor.c1.dispense(new Currency(amount));
            
        }
    }
    
}
