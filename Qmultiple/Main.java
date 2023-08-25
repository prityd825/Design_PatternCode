/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qmultiple;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args){
        Shape circle = new Circle();
        NewFunction function1 = new RedCircle();
        NewFunction function2= new GreenCircle();
        circle.draw(); 
        function1.CircleCalculate(5);
        function2.CircleCalculate(6);
        System.out.println();
        
        Shape rectangle = new Rectangle();
        NewFunction functionR = new RedRectangle();
        NewFunction functionRR = new GreenRectangle();
        rectangle.draw();
        functionR.RectangleCalculate(7, 8);
        functionRR.RectangleCalculate(9, 3);
        System.out.println();
        
        
        Shape triangle = new Triangle();
        NewFunction functionC = new RedRectangle();
        NewFunction functionCC = new GreenRectangle();
        triangle.draw();
        functionC.TriangleCalculate(6, 5);
        functionCC.TriangleCalculate(4, 3);
        
        
    }
}
