/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern;

/**
 *
 * @author HP
 */
abstract class Product {
    
    private String name;
    private double unitPrice;
    private String type;
    
    public Product (String name, double unitPrice, String type){
        this.name = name;
        this.unitPrice = unitPrice;
        this.type = type;
    }
    
    public String getName(){
        return name;
    }
    
    public double getUnitPrice(){
        return unitPrice;
    }
    
    public String getType(){
        return type;
    }
    
}
