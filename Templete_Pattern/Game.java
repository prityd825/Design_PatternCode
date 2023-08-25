/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Templete_Pattern;

/**
 *
 * @author HP
 */
public abstract  class Game {
    abstract void initialize();
    abstract void startplay();
    abstract void endplay();
    
    
    public final void play(){
        initialize();
        startplay();
        endplay();
        
    }
    
}
