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
public class Main {
    public static void main(String[] args) {
        AudioPlayer ob = new AudioPlayer();
        ob.play("MP3", "Tahsin.mp3");
        ob.play("MP4", "Tahsin2.mp4");
        ob.play("VLC", "Tahsin3.vlc");
    }
    
}
