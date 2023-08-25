/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QFactory;

/**
 *
 * @author HP
 */
public class ComputerFactory {
    
    public Computer getComputer(String ComputerType){
        
        if(ComputerType == null){
            return null;
        }
        
        else if(ComputerType=="Lab_1"){
            return new Lab_1();
        }
        
        else if(ComputerType == "Lab_2"){
            return new Lab_2();
        }
        
        else if(ComputerType =="Lab_3"){
            return new Lab_3();
        }
        
        else if (ComputerType == "Lab_4"){
            return new Lab_4();
        } 
        
        return null;
    }
    
}
