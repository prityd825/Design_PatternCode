/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype_pattern;

/**
 *
 * @author HP
 */
public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
       System.out.println("Inside Circle draw() method"); 
    }
    
    
}