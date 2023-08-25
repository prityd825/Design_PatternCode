/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design_Pattern.ProxyPattern;

/**
 *
 * @author TANIM
 */
public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("Cat");
        Image image2 = new ProxyImage("Cat");
        Image image3 = new ProxyImage("Dog");
        Image image4 = new ProxyImage("Dog");
        
        image1.display();
        image2.display();
        image3.display();
        image4.display();
    }
    
}
