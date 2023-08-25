/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern;

/**
 *
 * @author HP
 */
public abstract class DeliveryChargeCalculator {
    
    private DeliveryChargeCalculator next;
    
    public DeliveryChargeCalculator l (DeliveryChargeCalculator next){
        this.next = next;
        return next;
    }
    
  
    public abstract double calculate (Product product, String shippingType);
    
    
    protected double calculateNext(Product product, String shippingType){
        if(next == null){
           throw new UnsupportedOperationException("No delivery charge available for this product type: " + product.getType()); 
        }
        return next.calculate(product, shippingType);
    }
    
}


class PrinterChargeCalculator extends DeliveryChargeCalculator {
    private static final double Printer = 800;

    @Override
    public double calculate(Product product, String shippingType) {
        if (product instanceof Printer) {
            return Printer;
        }
        return calculateNext(product, shippingType);
    }
}


class MouseChargeCalculator extends DeliveryChargeCalculator{
    private static final double mouse = 60;
    
    public double calculate(Product product, String shippingType) {
        if (product instanceof Mouse) {
            return mouse;
        }
        return calculateNext(product, shippingType);
    }
}



class KeyboardChargeCalculator extends DeliveryChargeCalculator {
    private static final double Keyboard = 130;

    @Override
    public double calculate(Product product, String shippingType) {
        if (product instanceof Keyboard) {
            return Keyboard;
        }
        return calculateNext(product, shippingType);
    }
}
