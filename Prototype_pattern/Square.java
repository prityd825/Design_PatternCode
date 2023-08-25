/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype_pattern;

/**
 *
 * @author HP
 */
public class Square extends Shape{
    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
       System.out.println("Inside Square draw() method"); 
    }
    
    
}