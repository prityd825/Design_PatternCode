/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command_Pattern;

/**
 *
 * @author HP
 */
public class SellStock implements Order{
    
    private Stock abcStock;
    
    public SellStock(Stock abcStock){
        this.abcStock= abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
  
}
