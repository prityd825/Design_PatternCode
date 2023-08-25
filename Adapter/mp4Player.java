/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design_Pattern.Adapter;

/**
 *
 * @author TANIM
 */
public class mp4Player implements AdvancedMedia{

    @Override
    public void playVlc(String filename) {
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing with VLC media Player : filename :"+filename);
    }
    
    
}
