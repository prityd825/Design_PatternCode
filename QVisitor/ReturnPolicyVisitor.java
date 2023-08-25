/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QVisitor;

/**
 *
 * @author HP
 */
public class ReturnPolicyVisitor implements ProductVisitor {

    public ReturnPolicyVisitor() {
    }

    @Override
    public double visit(Electronics product) {
      return 60;
    }

    @Override
    public double visit(Plastic product) {
       return 30;
    }

    @Override
    public double visit(Vegetable product) {
       return 0;
    }
    
}
