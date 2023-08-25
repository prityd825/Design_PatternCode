/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrototypePattern;

/**
 *
 * @author HP
 */
public class Client {
    public static void main(String[] args){
        ShapeCache.loadCache();
        
        Shape cloneShape = (Shape) ShapeCache.getsShape("1");
        System.out.println("Shape : "+ cloneShape.getType());
        
         Shape cloneShape1 = (Shape) ShapeCache.getsShape("2");
        System.out.println("Shape : "+ cloneShape1.getType());
        
        
         Shape cloneShape2 = (Shape) ShapeCache.getsShape("3");
        System.out.println("Shape : "+ cloneShape2.getType());
    }
    
}
