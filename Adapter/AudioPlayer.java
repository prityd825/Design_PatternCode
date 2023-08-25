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
public class AudioPlayer implements MediaPlayer{
    private MediaAdapter adapter;

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("MP3")){
            System.out.println("This file is playing with MP3 player :filename :"+filename );
        }
        else if(audioType.equalsIgnoreCase("VLC")){
            adapter = new MediaAdapter("VLC");
            adapter.play(audioType, filename);
        }
        else if(audioType.equalsIgnoreCase("MP4")){
            adapter = new MediaAdapter("MP4");
            adapter.play(audioType, filename);
        }
    }
    
}
