/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer_Pattern;

/**
 *
 * @author HP
 */
public class Youtube {
    public static void main(String[] args){
    Channel tt = new Channel();
    Subscriber s = new Subscriber("Prity");
    Subscriber s1= new Subscriber("Priya");
    Subscriber s2= new Subscriber("Riya");
    Subscriber s3= new Subscriber("Bina");
    Subscriber s4 = new Subscriber("Mina");
    
    tt.subscribe(s);
    tt.subscribe(s1);
    tt.subscribe(s4);
    tt.subscribe(s3);
    tt.subscribe(s2);
    
    
    s1.subscribeChannel(tt);
    s.subscribeChannel(tt);
    s2.subscribeChannel(tt);
    s3.subscribeChannel(tt);
    s4.subscribeChannel(tt);
    
    tt.upload("Design pattern");
    
    }
}
