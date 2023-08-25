/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Template;

/**
 *
 * @author HP
 */
abstract class HouseTemp {
    //template method, final so subclasses cannot override it
   public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is build");
    }
    
    //default implememtation 
    private void buildWindows(){
        System.out.println("Building Glass Windows");
    }
    
    
    public abstract void buildWalls();
    public abstract void buildPillars();
    
    
    private void buildFoundation(){
        System.out.println("Building founadation with cement, iron, rods and sand");
    }
    
}
