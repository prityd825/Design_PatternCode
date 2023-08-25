/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package FactoryPattern;

/**
 *
 * @author HP
 */
public interface ShippingService {
    
    double calculateDeliveryCharge(Product product);
    
}

class StandardShippingService implements ShippingService{
    private static final double Standard = 800;

    @Override
    public double calculateDeliveryCharge(Product product) {
       return Standard; 
    }
}

class ExpressShippingService implements ShippingService
{
     private static final double Express = 1200;
     
    @Override
    public double calculateDeliveryCharge(Product product) {
      return Express;
    }
    
}
