/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype_pattern;

import java.util.Hashtable;

/**
 *
 * @author HP
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
    
    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return(Shape) cachedShape.clone();
    }
    
    public static void loadCache(){
      Circle circle = new Circle();
      circle.setId("1");
      shapeMap.put(circle.getId(), circle);
      
      Square square = new Square();
      square.setId("2");
      shapeMap.put(square.getId(),square);
      
      Rectangle rectangle = new Rectangle();
      rectangle.setId("3");
      shapeMap.put(rectangle.getId(), rectangle);
      
      
    }
}
