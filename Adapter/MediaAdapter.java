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
public class MediaAdapter implements MediaPlayer{
    private AdvancedMedia advanceMedia;
    
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("VLC")){
            advanceMedia = new vlcPlayer();
        }else if(audioType.equalsIgnoreCase("MP4")){
            advanceMedia = new mp4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("VLC")){
            advanceMedia.playVlc(filename);
        }
        if(audioType.equalsIgnoreCase("MP4")){
            advanceMedia.playMp4(filename);
        }
    }
    
}
