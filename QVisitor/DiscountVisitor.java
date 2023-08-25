/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QVisitor;

/**
 *
 * @author HP
 */
public class DiscountVisitor implements ProductVisitor{

    @Override
    public double visit(Electronics product) {
        return 0.20;
    }

    @Override
    public double visit(Plastic product) {
       return 0.10;
    }

    @Override
    public double visit(Vegetable product) {
         return 0.05;
    }
    
}
