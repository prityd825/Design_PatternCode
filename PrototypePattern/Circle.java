/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrototypePattern;

/**
 *
 * @author HP
 */
class Circle extends Shape{
    public Circle(){
        type ="Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle:: draw() method");
    }
}