/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author HP
 */
public class Client {
    
    public static void main(String[] args){
        Student a =Student.getStudent("A","2a",22,3.50);
        Student a1 =Student.getStudent("B","2a",22,3.50);
        a.show();
        a1.show(); 
   
    }
    
}
