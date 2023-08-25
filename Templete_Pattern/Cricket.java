/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Templete_Pattern;

/**
 *
 * @author HP
 */
public class Cricket extends Game{

    @Override
    void initialize() {
        System.out.println("Game : Cricket");
    }

    @Override
    void startplay() {
        System.out.println("Game started");
    }

    @Override
    void endplay() {
        System.out.println("Game finished! ");
    }
    
}
