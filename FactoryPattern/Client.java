/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern;

/**
 *
 * @author HP
 */
public class Client {
    public static void main(String[] args ){
        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();
        
        
        Shape shape2 = new RectangleFactory().getShape();
        shape2.draw();
        
        
        Shape shape3 = new SquareFactory().getShape();
        shape3.draw();
    }
    
}
