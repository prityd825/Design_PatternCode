/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QVisitor;

/**
 *
 * @author HP
 */
class ShippingVendorVisitor implements ProductVisitor{

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
        return 0.50;
    }
    
    public String getShippingVendor(ProductCategory product){
        if(product instanceof Electronics){
            return "Amazon USPS";
        }
        else if(product instanceof Plastic){
            return "Sundarbans Paribahan";
        }
        else if(product instanceof Vegetable){
            return "Shohoz Bazar";
        }
        return "Unknown vendor";
    }
    
}
