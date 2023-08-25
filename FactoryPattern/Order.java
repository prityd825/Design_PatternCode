/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Order {
    
    private List<Product> products;
    private String shippingType;
    private DeliveryChargeCalculator chargeCalculator;
    
    
    public Order (DeliveryChargeCalculator chargeCalculator) {
        
        this.products = new ArrayList<>();
        this.chargeCalculator = chargeCalculator;
    }

    public void addProduct(String name, double unitPrice, String type) {
        
        Product product = ProductFactory. createProduct(name, unitPrice, type);
        products.add(product);
    }

    public void setShippingType(String shippingType) 
    {
        this.shippingType = shippingType;
    }

    public double calculateDeliveryCharge() {
        
        double totalDeliveryCharge = 0;

        for (Product product : products) {
            double deliveryCharge = chargeCalculator.calculate(product, shippingType);
            totalDeliveryCharge += deliveryCharge;
        }
        
        
        return totalDeliveryCharge;
    }
}
