/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command_Pattern;

/**
 *
 * @author HP
 */
public class Stock {
    private String name = "abc";
    private int quantity = 10;
    
   public void buy(){
       System.out.println("Name: "+name+"And Quantity: "+quantity+ "is bought");
   } 
   
   public void sell(){
       System.out.println("Name: "+name+"And Quantity: "+quantity+ "is sold");
   }
    
}
