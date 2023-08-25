/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        
        DeliveryChargeCalculator c = new PrinterChargeCalculator();
        c.l(new MouseChargeCalculator());
        
        c.l(new KeyboardChargeCalculator());
        
        Order order = new Order(c);
        order.addProduct("Hp Pro M404N", 23000, "printer");
        order.addProduct("Logitech B170", 800, "mouse");
        order.addProduct("A4Tech B820R", 4500, "keyboard");

    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sample Input: ");
        String shippingType = scanner.nextLine();

        order.setShippingType(shippingType);

        
        double deliveryCharge = order.calculateDeliveryCharge();
        System.out.println("Delivery charge: " + deliveryCharge + " TK");
    }
}
