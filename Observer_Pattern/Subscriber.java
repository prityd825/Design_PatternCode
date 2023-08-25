/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer_Pattern;

/**
 *
 * @author HP
 */
public class Subscriber {
    private String name;
    private Channel channel= new Channel();

     Subscriber(String name) {
        super();
        this.name = name;
    }
     
    
     void update(){
        System.out.println(" Video uploaded");
    }
    public void subscribeChannel(Channel ch){
        channel = ch;
    }
    
    
    
}
