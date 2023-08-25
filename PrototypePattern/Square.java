/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrototypePattern;

/**
 *
 * @author HP
 */
class Square extends Shape{
    public Square(){
        type ="Sqaure";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle:: draw() method");
    }
}