/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QFactory;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args){
        
        ComputerFactory computerfactory = new ComputerFactory();
        
        Computer pc1 = computerfactory.getComputer("Lab_2");
        System.out.println(pc1.config());
        System.out.println("\n------\n");
      
        
        Computer pc2 = computerfactory.getComputer("Lab_4");
        System.out.println(pc2.config());
        
    }
    
}
