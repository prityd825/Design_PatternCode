/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Memento_Pattern;

/**
 *
 * @author HP
 */
public class Originator {
    private String state;
    
    public void setState(String state){
        this.state = state;
    }
    
    public String getState(){
        return state;
    }
    
    public Memento saveStateToMemento(){
        return new Memento(state);
    }
    
    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
