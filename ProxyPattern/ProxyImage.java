/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design_Pattern.ProxyPattern;

import java.util.HashMap;
import java.util.Map;

public class ProxyImage implements Image{
    public String filename;
    private RealImage realimage;
    private static Map<String,RealImage> imageCache = new HashMap<>();
    public ProxyImage(String filename){
        this.filename=filename;
    }
    @Override
    public void display() {
        if(realimage==null){
            realimage=imageCache.get(filename);
            if(realimage==null){
                realimage = new RealImage(filename);
                imageCache.put(filename, realimage);
                realimage.display();
            }else{
                realimage=imageCache.get(filename);
                System.out.println("This is displaying from the cache memory: "+realimage.filename);
            }
            
        }
        //realimage.display();
    }
    
}
