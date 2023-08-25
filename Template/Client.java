/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Template;

/**
 *
 * @author HP
 */
public class Client {
    public static void main(String[] args){
        HouseTemp housetype = new WoodenHouse();
        housetype.buildHouse();
        System.out.println("**************");
        
        housetype = new GlassHouse();
        housetype.buildHouse();
    }
}
