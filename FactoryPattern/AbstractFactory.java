/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern;

/**
 *
 * @author HP
 */
public abstract class AbstractFactory {
    
    protected abstract Shape factoryMethod();
    
    public Shape getShape(){
        return factoryMethod();
    }
    
}

class RectangleFactory extends AbstractFactory{

    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
    
}


class CircleFactory extends AbstractFactory{

    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
    
}


class SquareFactory extends AbstractFactory{

    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
    
}
