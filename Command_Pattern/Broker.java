/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command_Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();
    
    public void TakeOrder(Order order){
        orderList.add(order);
    }
    
    public void PlaceOrder(){
        for(Order order: orderList){
            order.execute();
        }
        orderList.clear();
    }
}
