/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QVisitor;

/**
 *
 * @author HP
 */
public class Main {
    public static void main (String[] args)
    {
        ProductVisitor discountVisitor = new DiscountVisitor();
        ProductVisitor returnVisitor = new ReturnPolicyVisitor();
        ShippingVendorVisitor shippingVisitor = new ShippingVendorVisitor();
        
        ProductCategory plastic = new Plastic();
        
        System.out.println("Category Name : "+plastic.getName());
        System.out.println("Discounts: "+(plastic.accept(discountVisitor)*100)+"%");
        System.out.println("Return : "+(int) plastic.accept(returnVisitor)+" days");
        System.out.println("Vendor: "+shippingVisitor.getShippingVendor(plastic));
      
        
       
    }
}
