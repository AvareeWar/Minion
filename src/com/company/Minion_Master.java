package com.company;

import com.company.Music.MusicPlayer;
import com.company.PersonaIdentifier.PersonMaker;
import com.company.PersonaIdentifier.Persona;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.sound.midi.Synthesizer;
import javax.swing.*;

public class Minion_Master{

    //Synthesizer synth = Central.createSynthesizer(new SynthesizerModeDesc(Locale.ENGLISH));

    //Create instances of other classes
    public static Minion_Login logins = new Minion_Login();
    public static Minion_Commands_Responses comres = new Minion_Commands_Responses();
    public static PersonMaker peeps = new PersonMaker();
    public static MusicPlayer music = new MusicPlayer();

    //Basic Character attributes
    String nameRec;
    String username = "josh";
    String password = "base";

    String hello = "Hello ";
    String minion = "Minion";
    String welcome = "Welcome, Master";

    ArrayList<String> voiceCommands = new ArrayList<>();
    Map<String, String> dictionaryCommands = new HashMap<String, String>();

    ArrayList<String> systemResponse = new ArrayList<>();
    Map<String, String> dictionaryResponses = new HashMap<String, String>();

    public void Minion(ArrayList<String> voiceCommands, ArrayList<String> systemResponse, String username, String password)
    {
        this.voiceCommands = voiceCommands;
        this.systemResponse = systemResponse;
        this.nameRec = nameRec;
        this.username = username;
        this.password = password;
    }

    public void intializeStartup(String user, String pass, String input)
    {
        if(input.equals("Hello Minion") || input.equals("hello minion") || input.equals("HELLO MINION"))
        {
            System.out.println(welcome);
            logins.login(user, pass);
        }
        else{
            System.out.println("Unknown Entity: Retry initialization process");
        }
    }
}
