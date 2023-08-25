/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qmultiple;

/**
 *
 * @author HP
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        } else if(shapeType == "Circle")
        {
            return new Circle();
        } else if(shapeType == "Rectangle"){
            return new Rectangle();
        } else if(shapeType == "Triangle"){
            return new Triangle();
        }
        return null;
    }
    
    
}
