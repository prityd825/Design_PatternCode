/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package QVisitor;

/**
 *
 * @author HP
 */
interface ProductVisitor {
    double visit(Electronics product);
    double visit(Plastic product);
    double visit(Vegetable product);
    
}
