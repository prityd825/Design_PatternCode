/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package QVisitor;

/**
 *
 * @author HP
 */
interface ProductCategory {
    String getName();
    double accept(ProductVisitor visitor);
}
