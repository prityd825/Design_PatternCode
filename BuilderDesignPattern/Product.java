/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderDesignPattern;

import java.util.LinkedList;

/**
 *
 * @author HP
 */
class Product {
    private LinkedList<String> parts;
    
    public Product(){
        parts = new LinkedList<String>();
    }
    
    public void add(String part){
        parts.addLast(part);
    }
    public void show(){
        System.out.println("\n product completed as below: ");
        
        for(int i=0;i< parts.size(); i++){
            System.out.println(parts.get(i));
        }
    }
}
