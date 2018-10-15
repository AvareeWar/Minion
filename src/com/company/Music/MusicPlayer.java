package com.company.Music;

import com.company.Minion_Login;
import com.company.Minion_Master;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import org.junit.Test;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;

public class MusicPlayer extends Minion_Master {

    public void playMusic(String artist, String song){

        String dirPath = "C:\\Users\\Avaree\\Desktop\\Main_Music";
        String pathOfSong = "C:\\Users\\Avaree\\Desktop\\Main_Music\\";
        String[] song_name = song.split(" " + "-");
        String del = "\\";

        File dir = new File(dirPath);
        String[] files = dir.list();
        if (files.length == 0) {
            System.out.println("The directory is empty");
        } else {
            for (String aFile : files) {
                if(aFile.equalsIgnoreCase(artist)){
                    pathOfSong += aFile;
                    File dir2 = new File(pathOfSong);
                    String[] files2 = dir2.list();
                    for(String sFile : files2){
                        String[] folderSong = sFile.split(" " + "-");
                        //could of made this linear for better run time but whatevs because this is an mp3 player for a helmet
                        for(int j = 0; j < folderSong.length; j++) {
                            for (int i = 0; i < song_name.length; i++) {
                                if(folderSong[j].equalsIgnoreCase(song_name[i]) || folderSong[j].contains(song_name[i].toLowerCase()) || folderSong[j].contains(song_name[i].toUpperCase())){
                                    pathOfSong += del + sFile;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(pathOfSong);
        playSong(pathOfSong);
    }

    public void checkSongs(String artist, String song){

        String dirPath = "C:\\Users\\Avaree\\Desktop\\Main_Music";
        String pathOfSong = "C:\\Users\\Avaree\\Desktop\\Main_Music\\";
        String[] song_name = song.split(" " + "-");
        String del = "\\";

        File dir = new File(dirPath);
        String[] files = dir.list();
        if (files.length == 0) {
            System.out.println("The directory is empty");
        } else {
            for (String aFile : files) {
                if(aFile.equalsIgnoreCase(artist)){
                    System.out.println("aFile");
                    pathOfSong += aFile;
                    File dir2 = new File(pathOfSong);
                    String[] files2 = dir2.list();
                    for(String sFile : files2){
                        System.out.println(sFile);
                        String[] folderSong = sFile.split(" " + "-");
                        //could of made this linear for better run time but whatevs because this is an mp3 player for a helmet
                        for(int j = 0; j < folderSong.length; j++) {
                            for (int i = 0; i < song_name.length; i++) {
                                if(folderSong[j].equalsIgnoreCase(song_name[i]) || folderSong[j].contains(song_name[i].toLowerCase()) || folderSong[j].contains(song_name[i].toUpperCase())){
                                    pathOfSong += del + sFile;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(pathOfSong);
    }

    public void playSong(String path){
        Media hit = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
    }


    public void musicInterface(){

        String info = JOptionPane.showInputDialog(null, "MUSIC PLAYER \n " +
                " ---------------------- \n What do you wish to do here: \n ---------------------- \n  LISTEN  \n CHECK \n \n GO TO CATEGORIES");

        if(info.equals("LISTEN") || info.equals("Listen") || info.equals("listen")){
            String artist = JOptionPane.showInputDialog(null, "ARTIST'S NAME:");

            if(artist.equalsIgnoreCase("back")){
                musicInterface();
            }
            if(artist.equalsIgnoreCase("categories")){
                logins.interfaceForUser();
            }

            String song = JOptionPane.showInputDialog(null, "SONG NAME:");
            if(song.equalsIgnoreCase("back")){
                musicInterface();
            }
            if(song.equalsIgnoreCase("categories")){
                logins.interfaceForUser();
            }

            playMusic(artist, song);
            musicInterface();
        }

        if(info.equals("CHECK") || info.equals("check") || info.equals("Check")){
            String artist = JOptionPane.showInputDialog(null, "ARTIST'S NAME:");
            String song = JOptionPane.showInputDialog(null, "SONG NAME:");
            checkSongs(artist, song);
            musicInterface();
        }


        if(info.equals("categories") || info.equals("CATEGORIES") || info.equals("back") || info.equals("BACK")){
            logins.interfaceForUser();
        }


    }




}