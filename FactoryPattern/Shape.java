/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern;

/**
 *
 * @author HP
 */
interface Shape {
    void draw();  
}

class Rectangle implements Shape{

    @Override
    public void draw() {
       System.out.println("Inside Rectangle:: draw() method");
    }
    
}

class Square implements Shape{

    @Override
    public void draw() {
       System.out.println("Inside Square:: draw() method");
    }
    
}


class Circle implements Shape{

    @Override
    public void draw() {
       System.out.println("Inside Circle:: draw() method");
    }
    
}
