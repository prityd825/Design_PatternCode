/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Channel {
    private List <Subscriber> subs = new ArrayList<>();
    private  String title;
    
    public void subscribe( Subscriber sub){
        subs.add(sub);
    }
    public void unSubscribe(Subscriber sub){
        subs.remove(sub);
    }
    
    public  void notifyAllSubscriber(){
        for(Subscriber sub: subs){
            sub.update();
        }
    }
    public void upload(String title){
        this.title= title;
        notifyAllSubscriber();
    }
    
}
