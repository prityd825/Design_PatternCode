/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdapterPattern;

/**
 *
 * @author HP
 */
public class MP4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
       
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing Mp4 File : "+fileName);
    }
    
}
