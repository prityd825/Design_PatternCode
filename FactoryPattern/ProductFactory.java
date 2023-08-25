/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern;

/**
 *
 * @author HP
 */
public class ProductFactory 
 {
    public static Product createProduct (String name, double unitPrice, String type)
    {
        switch(type. toLowerCase())
        {
            case "printer":
                return new Printer(name, unitPrice, type);
            
            case "mouse":
                return new Mouse(name, unitPrice, type);
                
            case "keyboard":
                return new Keyboard(name, unitPrice, type);
            default: 
                throw new IllegalArgumentException("Invalid product type: "+type);
        }
    }
    
    
}
