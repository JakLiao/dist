/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author tame
 */
import javax.swing.*;
import java.net.URL;
import java.applet.*;
public class Music extends JApplet{
     static AudioClip audioClip;

     public Music(){
          URL url=getClass().getResource("1.wav");
          audioClip=Applet.newAudioClip(url);
          audioClip.loop();
     }

}
