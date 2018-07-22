package com.company.Music;

import com.company.Minion_Login;
import com.company.Minion_Master;
import org.junit.Test;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.BufferedInputStream;
import java.io.InputStream;

public class MusicPlayer extends Minion_Master {

    String path = "C:\\Users\\AvareeDesktop\\Music\\Past.mp3";

    public void playMusic() {
        
    }


    @Test
    public void testMusic(){
        playMusic();
    }



}