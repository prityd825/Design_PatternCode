/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory__Pattern;

/**
 *
 * @author HP
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null)
        {
            return null;
        }
        else if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("Sqaure")){
            return new Square();
        }
        return null;
    }
    
}
