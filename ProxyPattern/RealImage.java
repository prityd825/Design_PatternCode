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
public class RealImage implements Image{
    public String filename;
    public RealImage(String filename){
        this.filename=filename;
    }

    @Override
    public void display() {
        System.out.println("Displaying the file : "+filename);
    }
    public void loadFromDisk(){
        System.out.println("Load From the Disk :"+filename);
    }
    
}
